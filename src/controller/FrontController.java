package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.*;;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String operacao = request.getParameter("operacao");

		try {
			Command cmd = CommandFactory.obterCommand(operacao);
			String paginaDestino = cmd.executar(request, response);

			request.getRequestDispatcher(paginaDestino).forward(request,response);

		} catch (Exception e) {
			// tratamento de erro
			//
			trataErro(request, response, e);
		}

	}
	
	private void trataErro(HttpServletRequest request,
			HttpServletResponse response, Exception e) throws ServletException,
			IOException {
		// envia para pagina de erro
		//
		request.getSession().setAttribute("erro", e.toString());
		request.getRequestDispatcher("frmErro.jsp").forward(request, response);
	}	

}
