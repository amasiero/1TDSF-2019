package com.andreymasiero.chatbot.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.cloud.sdk.core.http.HttpMediaType;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.speech_to_text.v1.SpeechToText;
import com.ibm.watson.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.speech_to_text.v1.model.SpeechRecognitionResults;

@WebServlet(urlPatterns = "/speech")
@MultipartConfig
public class SpeechToTextServlet extends HttpServlet {

	private static final long serialVersionUID = -4738982519790006949L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		byte[] buffer = new byte[1024 * 1024];
		
		InputStream is = req.getInputStream();
		File tempFile = File.createTempFile("speech-", ".wav", null);
		
		try (FileOutputStream fos = new FileOutputStream(tempFile)) {
			int read;
			while((read = is.read(buffer)) != -1) {
				fos.write(buffer, 0, read);
			}
		}
		
//      Para testar o arquivo de audio criado a partir do streamming		
//		try {
//			AudioInputStream ais = AudioSystem.getAudioInputStream(tempFile.getAbsoluteFile());
//			Clip clip = AudioSystem.getClip();
//			clip.open(ais);
//			clip.start();
//		} catch (UnsupportedAudioFileException | LineUnavailableException e) {
//			e.printStackTrace();
//		}
		
		IamOptions options = new IamOptions.Builder()
				.apiKey("ao2Cd_KW7CFgvr67q9YY0xsFsZnOADSvMsvrnKtxW7cC")
				.build();
		
		SpeechToText service = new SpeechToText(options);
		
		RecognizeOptions recOptions = new RecognizeOptions.Builder()
				.audio(tempFile)
				.contentType(HttpMediaType.AUDIO_WAV)
				.build();
		
		SpeechRecognitionResults transcript = service.recognize(recOptions).execute().getResult();
		System.out.println(transcript);
		
	}

}
