package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Locacao;


public class CommandDevolverVeiculo extends Command {

	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		Locacao devolucao =  new Locacao();
		
		
		devolucao.setIntID(Integer.parseInt(request.getParameter("txtCodigoLocacao")));
		devolucao.setDtLocacao(request.getParameter("txtDataDevolucao"));
		devolucao.setHrLocacao(request.getParameter("txtHoraDevolucao"));
		devolucao.getItem().setAgencia(request.getParameter("txtAgencia"));
		devolucao.devolverVeiculo();
		 
		return "frmLocarVeiculo.jsp";
		
	}		
	
	
}
