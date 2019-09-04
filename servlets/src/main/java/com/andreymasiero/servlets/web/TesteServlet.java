package com.andreymasiero.servlets.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/teste")
public class TesteServlet extends HttpServlet {

	private static final long serialVersionUID = -5559725547495332582L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Acessando o método init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Chamando o método doGet");
	}
	
	@Override
	public void destroy() {
		System.out.println("Acessando o método destroy");
	}

}
