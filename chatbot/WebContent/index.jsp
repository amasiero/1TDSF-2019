<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ChatBot Example w/ Watson and Java Web Application</title>
<link rel="icon" href="favicon.png">
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>
<body>
	<div class="center">
		<h2>Chabot Example w/ Watson and Java</h2>
		<div id="textchat" class="pulse"></div>
		<input type="text" id="question" name="question" class="field"
			placeholder="Type your question" />
		<div id="controls">
			<button id="sendQuestion">Send</button>
			<button id="recordButton">Record</button>
			<button id="pauseButton" disabled>Pause</button>
			<button id="stopButton" disabled>Stop</button>
		</div>
		<h2>Recordings</h2>
		<ol id="recordingsList"></ol>
	</div>
	<script src="https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js"></script>
	<script type="text/javascript" src="js/sound.js"></script>
	<!-- <script type="text/javascript" src="js/main.js"></script> -->
</body>
</html>