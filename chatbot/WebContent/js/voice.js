var btnGetVoice = document.querySelector("#getVoiceButton");

btnGetVoice.addEventListener("click", function(event) {
	event.preventDefault();
	
	var question = document.querySelector("#question");
	
	sendMessageToVoice(question.value);
	
	question.value = "";
});

function sendMessageToVoice(message) {
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "tts", true);
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
	xhr.addEventListener("load", function() {
		if (xhr.status == 200) {
			var blob = new Blob([this.response], {type : "audio/wav"});
			createAudioElement(blob);
		} else {
			console.log(xhr.status);
			console.log(xhr.responseText);
		}
	});

	xhr.responseType = 'blob';
	data = "msg=" + message;
	xhr.send(data);
}

function createAudioElement(blob) {
	var url = URL.createObjectURL(blob);
	var au = document.createElement("audio");
	var li = document.createElement("li");
	
	au.controls = true;
	au.src = url;
	
	li.appendChild(au);
	document.querySelector("#recordingsList").appendChild(li);
}