package controller;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		throw new RuntimeException("Operação não permitida. Você deve fazer login novamente!");
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    										throws ServletException, IOException {

		
		Login l = new Login(request.getParameter("txtLogin"),request.getParameter("txtSenha") );
				
		if (l.validarLogin()) {
			
		    request.getSession().setAttribute("txtLogin", l.getUsuario());
		 // Arrumar tela frmPrincipal
		    response.sendRedirect("protected/frmPrincipal.jsp");
		  //  response.sendRedirect("protected/frmCadastrarPessoaFisica.jsp");
		    
		} else {
			
		    response.getWriter().print("Usuário / Senha ínvalido!");   
		}
}	

	
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>	

}
