package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandIncluirPessoaFisica extends Command {

	 
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	 
		return "frmCadastrarPessoaFisica.jsp";
	}

}
