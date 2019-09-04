package com.andreymasiero.chatbot.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andreymasiero.chatbot.chat.Chat;
import com.google.gson.Gson;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.CreateSessionOptions;
import com.ibm.watson.assistant.v2.model.DialogRuntimeResponseGeneric;
import com.ibm.watson.assistant.v2.model.MessageContext;
import com.ibm.watson.assistant.v2.model.MessageInput;
import com.ibm.watson.assistant.v2.model.MessageInputOptions;
import com.ibm.watson.assistant.v2.model.MessageOptions;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.model.SessionResponse;

@WebServlet(urlPatterns = "/chat")
public class MessageServlet extends HttpServlet{

	private MessageContext context;
	private static final long serialVersionUID = 6093948662123015033L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		String message = req.getParameter("question");
		
		if (message.isEmpty())  this.context = new MessageContext();
		
		MessageResponse response = this.conversationAPI(message, context);
		
		Chat chat = new Chat();
		chat.addUserMessage(message);
		
		for(DialogRuntimeResponseGeneric text : response.getOutput().getGeneric()) {
			chat.addBotMessage(text.getText());
		}
		
		if(response.getContext() != null) context = response.getContext();
		
		resp.setContentType("application/json");
		resp.getWriter().write(new Gson().toJson(response.getOutput().getGeneric()));
	}
	
	private MessageResponse conversationAPI(String text, MessageContext context){
		
		// Configuração do Assistente do Watson
		IamOptions options =  new IamOptions.Builder()
				.apiKey("MZeBQlhJ50VeMOUqPddbLAVtZ7h-jQ9rNX7We67FGcN0")
				.build();
		Assistant service = new Assistant("2019-02-28", options);
		String assistantId = "48abc31e-13ba-4856-b97f-76a5c4854569";
		
		// Criando a sessão
		CreateSessionOptions sessionOptions = new CreateSessionOptions.Builder().assistantId(assistantId).build();
		SessionResponse session = service.createSession(sessionOptions).execute().getResult();
		String sessionId = session.getSessionId();
		
		// Definido o retorno do contexto da conversa
		MessageInputOptions inputOptions = new MessageInputOptions();
		inputOptions.setReturnContext(true);
		
		// Iniciando a conversa
		MessageInput input = new MessageInput.Builder()
				.text(text)
				.options(inputOptions)
				.build();
		
		MessageOptions optionsMessage = new MessageOptions.Builder()
				.assistantId(assistantId)
				.sessionId(sessionId)
				.input(input)
				.context(context)
				.build();
		
		MessageResponse response = service.message(optionsMessage)
				.execute()
				.getResult();
		
		System.out.println(response);
		
		return response;
	} 

}