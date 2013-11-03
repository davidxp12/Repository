package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandIncluirVeiculo extends Command {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute("operacao", "incluir");
		return "frmCadastrarVeiculo.jsp";

	}

		
		

}
