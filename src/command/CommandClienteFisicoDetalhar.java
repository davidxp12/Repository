package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaFisica;

public class CommandClienteFisicoDetalhar extends Command {

 
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		PessoaFisica clienteFisico = new PessoaFisica();
		clienteFisico.setId(Integer.parseInt(request.getParameter("item")));
		
 
		
		request.getSession().setAttribute("selecionarClienteFisico", clienteFisico.getClienteFisicoById(clienteFisico.getId()));
		
		PessoaFisica pf = new PessoaFisica();

		List<PessoaFisica> retorno2 = new ArrayList<PessoaFisica>();

		retorno2 = pf.obterClientes("", "");
		request.getSession().setAttribute("listaClientesFisicos",retorno2);
		
		
		return "frmPessoaFisicaDetalhar.jsp";
	}

}
