package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandClienteJuridicoIncluir extends Command {

	 
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 
		return "frmCadastrarPessoaJuridica.jsp";
	}

}
