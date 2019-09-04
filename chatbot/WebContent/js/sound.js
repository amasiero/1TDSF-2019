//webkitURL é legado então sempre é bom manter a opção.
URL = window.URL || window.webkitURL;
// stream from getUserMedia()
var gumStream;
// Recorder.js object
var rec;
// MediaStreamAudioSourceNode we'll be recording
// shim for AudioContext when it's not avb.
var input;
// new audio context to help us record
var AudioContext = window.AudioContext || window.webkitAudioContext;
var audioContext;
// Selecionando os botões
var recordButton = document.querySelector("#recordButton");
var pauseButton = document.querySelector("#pauseButton");
var stopButton = document.querySelector("#stopButton");
// Atribuindo função para os eventos de cliques de cada botão
recordButton.addEventListener("click", startRecording);
pauseButton.addEventListener("click", pauseRecording);
stopButton.addEventListener("click", stopRecording);

function startRecording() {
  constraints = {
    audio : true,
    video : false
  }

  recordButton.disabled = true;
  pauseButton.disabled = false;
  stopButton.disabled = false;

  navigator.mediaDevices.getUserMedia(constraints).then(function(stream) {
    console.log("getUserMedia() success, stream created, initializing Recorder.js ...");
    audioContext = new AudioContext;
    gumStream = stream;
    input = audioContext.createMediaStreamSource(stream);
    rec = new Recorder(input, {
      numChannels : 1
    });
    rec.record();
    console.log("Recording started");
  }).catch(function(err) {
    recordButton.disabled = false;
    stopButton.disabled = true;
    pauseButton.disabled = true;
  });
}

function pauseRecording() {
  console.log("pauseButton clicked rec.recording=", rec.recording);
  if(rec.recording) {
    rec.stop();
    pauseButton.textContent = "Resume";
  } else {
    rec.record();
    pauseButton.textContent = "Pause";
  }
}

function stopRecording() {
  console.log("stopButton clicked!");
  recordButton.disabled = false;
  stopButton.disabled = true;
  pauseButton.disabled = true;
  pauseButton.textContent = "Pause";
  rec.stop();
  gumStream.getAudioTracks()[0].stop();
  rec.exportWAV(generateBlob);
}

function generateBlob(blob) {
  var url = URL.createObjectURL(blob);
  var au = document.createElement("audio");
  var li = document.createElement("li");

  au.controls = true;
  au.src = url;

  li.appendChild(au);
  document.querySelector("#recordingsList").appendChild(li);
  console.log(blob);

  var xhr = new XMLHttpRequest();
  xhr.open("POST", "https://andrey-fiap-challenge.mybluemix.net/voice", true);
  xhr.setRequestHeader("Content-type", "multipart/form-data");
  xhr.addEventListener("load", function() {
		if (xhr.status == 200) {
			var respostas = JSON.parse(xhr.responseText);
			respostas.forEach(function (resposta) {
				createMessage(resposta.text, "bot", true);
			});
		} else {
			console.log(xhr.status);
			console.log(xhr.responseText);
		}
	});

  xhr.send(blob);
}
