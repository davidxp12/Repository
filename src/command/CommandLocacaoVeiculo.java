package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.Veiculo;

public class CommandLocacaoVeiculo extends Command{
	
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Veiculo v = new Veiculo();
		Cliente c = new Cliente();
				
		List<Veiculo> retorno = new ArrayList<Veiculo>();
		retorno = v.pesquisar();

		request.getSession().setAttribute("listaVeiculos", retorno);
		
		List<Cliente> retorno2 = new ArrayList<Cliente>();
		retorno2 = c.ObterClientes();
		
		request.getSession().setAttribute("listaClientes", retorno2);
		
		return "frmLocarVeiculo.jsp";
		
	}	
	
}
