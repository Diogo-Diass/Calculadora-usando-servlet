package calculadora;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class CalcularServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String strN1 = req.getParameter("n1");
		int n1 = Integer.parseInt(strN1);
		int n2 = Integer.parseInt(req.getParameter("n2"));
		String operacao = req.getParameter("operacao");
		int resultado = 0;
		
		switch(operacao) {
		case "operacao1":
		 resultado = n1 + n2;
		 break;
		case "operacao2":
		 resultado = n1 - n2;
		 break;
		case "operacao3":
		resultado = n1 * n2;
		break;
		case "operacao4":
		resultado = n1 / n2;
		break;
			default:
				break;
		}
		req.setAttribute("corescolhida", req.getParameter("cor"));
		req.setAttribute("resultado", resultado);
		req.getRequestDispatcher("resultado.jsp").forward(req, resp);
	}
}
