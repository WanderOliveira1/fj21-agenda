package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PaginaTeste", urlPatterns = { "/oi", "/ola" }, initParams={@WebInitParam(name="param",value="UsaBancoX")})

public class PaginaTeste extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("contatos:");
		out.println("</body>");
		out.println("</html>");

	}
	String parametro1;
	public void init (ServletConfig config) throws ServletException {
		super.init(config);
		this.parametro1 = config.getInitParameter("Param1");
	}

}
