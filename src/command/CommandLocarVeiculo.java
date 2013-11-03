package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Locacao;


public class CommandLocarVeiculo extends Command {
	
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Locacao nova = new Locacao();
				
		nova.setIntID(0);
		nova.setAgenciaLocacao("Barueri-SP");
		nova.setDtLocacao (request.getParameter("txtDataLocacao"));
		nova.setHrLocacao (request.getParameter("txtHoraLocacao"));
		nova.setStatus ("Pendente");
		nova.getItem().getCliente().setId(Integer.parseInt(request.getParameter("lstCliente")));
		nova.getItem().getVeiculo().setId(Integer.parseInt(request.getParameter("lstVeiculo")));
		nova.getItem().getCondutor().setId(Integer.parseInt(request.getParameter("lstCondutor")));
		nova.getItem().setDtDevolucao(request.getParameter("txtDataDevolucao"));
		nova.getItem().setHrDevolucao(request.getParameter("txtHoraDevolucao"));
		nova.LocarVeiculo();
		return "frmListaLocacao.jsp";
		
	}	
	
}
