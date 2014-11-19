package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ComentarioServlet", "/cs"})
public class ComentarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet
	(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String chaveLogin = request.getParameter("login");
		String chaveEmail = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body> Conteudo do método doGet");
		out.print("<br>login: "+ chaveLogin);
		out.print("<br>email: "+ chaveEmail);
		out.print("</body></html>");
		out.flush();
		out.close();
	}

	protected void doPost
	(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String chaveNome = request.getParameter("nome");
		String chaveComentario = request.getParameter("comentario");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body> Conteudo do método doPost");
		out.print("<br>Nome: "+ chaveNome);
		out.print("<p>Comentario: "+ chaveComentario + "</p>");
		out.print("</body></html>");
		out.flush();
		out.close();
	}

}
