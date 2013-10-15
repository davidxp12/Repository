package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import model.Login;
import model.PessoaFisica;
import model.PessoaJuridica;

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
		    
		    
		    
		    // CONFIGURAÇÕES PESSOA FISICA.
			PessoaFisica pf = new PessoaFisica();
			List<PessoaFisica> retorno2 = new ArrayList<PessoaFisica>();
			retorno2 = pf.obterClientes(request.getParameter("txtNome"), request.getParameter("txtCGC"));
			request.getSession().setAttribute("listaClientesFisicos",retorno2);
			
			  // CONFIGURAÇÕES PESSOA JURIDICA.
			
			PessoaJuridica pj = new PessoaJuridica();
			List<PessoaJuridica> retorno3 = new ArrayList<PessoaJuridica>();
			retorno3 = pj.obterClientesJuridicos(request.getParameter("txtNomeFantasia"), request.getParameter("txtCnpj"));
			request.getSession().setAttribute("listaClientesJuridicos",retorno3);
			
			
			//CONFIGURAÇÕES CONDUTOR
			retorno3 = pj.obterClientesJuridicos("","");
			
			for(int i=0; i < retorno3.size(); i++)
			{
				System.out.println("Nome juridico: " + retorno3.get(i).getNome() + " ID: " + retorno3.get(i).getId());
			}
			
			request.getSession().setAttribute("pessoasJuridicas",retorno3);
				
		    
		    
		} else {
			
		    response.getWriter().print("Usuário / Senha ínvalido!");   
		}
}	

	
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>	

}
