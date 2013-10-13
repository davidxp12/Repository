package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaJuridica;

public class CommandClienteJuridicoExcluir extends Command {
 
	public String executar(HttpServletRequest req,HttpServletResponse response) throws Exception {
		 
		PessoaJuridica clienteJuridico = new PessoaJuridica();
		clienteJuridico.setId(Integer.parseInt(req.getParameter("item")));
		
		clienteJuridico.Excluir(clienteJuridico.getId());
		
	 
		
		List<PessoaJuridica> retorno2 = new ArrayList<PessoaJuridica>();
		retorno2 = clienteJuridico.obterClientesJuridicos("", "");
		req.getSession().setAttribute("listaClientesJuridicos",retorno2);
		
		
		return "frmClienteJuridicoLista.jsp";
	}

}
