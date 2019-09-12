package com.andreymasiero.chatbot.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;
import com.ibm.watson.text_to_speech.v1.util.WaveUtils;

@WebServlet(urlPatterns = "/tts")
public class TextToSpeechServlet extends HttpServlet {

	private static final long serialVersionUID = 688819529094806727L;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String msg = req.getParameter("msg");
		System.out.println(msg);
		IamOptions options = new IamOptions.Builder()
				.apiKey("Cqsj8vtyjlI-rEpt3eV8OCM9N8UOscPxFZYn5Ys22aMj")
				.build();
		
		TextToSpeech tts = new TextToSpeech(options);
		
		SynthesizeOptions sOptions = new SynthesizeOptions.Builder()
				.text(msg)
				.accept("audio/wav")
				.voice("pt-BR_IsabelaV3Voice")
				.build();
		
				
		InputStream is = tts.synthesize(sOptions).execute().getResult();
		InputStream in = WaveUtils.reWriteWaveHeader(is);
		
		byte[] buffer = new byte[1024 * 1024];
		try (OutputStream os = resp.getOutputStream()) {
			int length;
			while((length = in.read(buffer)) != -1) {
				os.write(buffer, 0, length);
			}
		}
		
	
//		
//		try {
//			AudioInputStream ais = AudioSystem.getAudioInputStream(tempFile.getAbsoluteFile());
//			Clip clip = AudioSystem.getClip();
//			clip.open(ais);
//			clip.start();
//		} catch (UnsupportedAudioFileException | LineUnavailableException e) {
//			e.printStackTrace();
//		}
		
	}
	

}
