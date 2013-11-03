package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Locacao;

public class CommandDevolucaoVeiculo extends Command{

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Locacao l = new Locacao();
		List<Locacao> retorno = new ArrayList<Locacao>();
		
		request.getSession().setAttribute("listaLocacao", retorno);
		
		retorno = l.obterLocacoes();
		
		return "frmDevolverVeiculo.jsp";
		
	}

	
	
}
