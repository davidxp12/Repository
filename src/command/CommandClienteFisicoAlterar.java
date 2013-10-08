package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PessoaFisica;

public class CommandClienteFisicoAlterar extends Command {

	
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		PessoaFisica clienteFisico = new PessoaFisica();
		clienteFisico.setId(Integer.parseInt(request.getParameter("id")));
		
		
		request.getSession().setAttribute("selecionarClienteFisico",
				clienteFisico.getClienteFisicoById(Integer.parseInt(request.getParameter("id"))));
		
		
		
		return "frmPessoaFisicaAlterar.jsp";
	}

}
