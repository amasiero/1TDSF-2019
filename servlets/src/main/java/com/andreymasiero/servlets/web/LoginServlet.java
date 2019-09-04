package com.andreymasiero.servlets.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.andreymasiero.servlets.bussiness.UsuarioBO;
import com.andreymasiero.servlets.model.entities.Usuario;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = -4893569432445997382L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletContext context = getServletContext();
		context.setAttribute("data", new Date());
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new Usuario(login, senha);
		
		out.println("<html><body>");
		
		usuario = new UsuarioBO().autenticar(usuario);
		
		if(usuario != null) {
			out.println("<h2>Usuário " + usuario.getNome() + " autenticado com sucesso.</h2>");
			HttpSession session = req.getSession();
			session.setAttribute("usuario", usuario);			
		} else {
			out.println("<h2 style=\"color:red;\"> Deu ruim!</h2>");
		}
		
		out.println("<a href=\"index.html\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}

}
