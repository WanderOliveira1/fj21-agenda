package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;


/**
 * Servlet implementation class Service
 */
@WebServlet("/adicionaContato")
public class adicionaContato extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Contato contato = new Contato();
		PrintWriter out = resp.getWriter();
		
		contato.setNome (req.getParameter("nome"));
		contato.setEmail (req.getParameter("email"));
		contato.setEndereco (req.getParameter("endereco"));
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento"));
					Calendar cal = Calendar.getInstance();
					cal.setTime(data);
					contato.setDataNascimento(cal);
		}catch (ParseException e) {
		out.println("erro de data");
		throw new ServletException(e);
	}
		ContatoDao dao;
		try {
			dao = new ContatoDao();
			dao.insert(contato);
			out.println("<html>");
			out.println("<body>");
			out.println("Adicionado com Sucesso");
			out.println("</body>");
			out.println("</html>");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

