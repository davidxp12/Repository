package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaJuridica;

public class CommandClienteJuridicoLista extends Command {

 
	public String executar(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
		PessoaJuridica pj = new PessoaJuridica();
		List<PessoaJuridica> retorno3 = new ArrayList<PessoaJuridica>();
		retorno3 = pj.obterClientesJuridicos(request.getParameter("txtNome"), request.getParameter("txtCGC"));
		request.getSession().setAttribute("listaClientesJuridicos",retorno3);
		
		return "frmClienteJuridicoLista.jsp";
		
	}

}
