package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaFisica;

public class CommandClienteFisicoExcluir extends Command {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		PessoaFisica clienteFisico = new PessoaFisica();
		clienteFisico.setId(Integer.parseInt(request.getParameter("item")));
		
		clienteFisico.Excluir(clienteFisico.getId());
		
		
		return "frmClienteFisicoLista.jsp";
	}

}
