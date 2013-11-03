package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Veiculo;

public  class CommandCadastrarVeiculo extends Command {
	
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Veiculo novo = new Veiculo();
		
		novo.setChassi(request.getParameter("txtChassi"));
		novo.setPlaca (request.getParameter("txtPlaca"));
		novo.setCidade (request.getParameter("txtCidade"));
		novo.setEstado( request.getParameter("txtEstado"));
		novo.setGrupo (request.getParameter("cboGrupo"));
		novo.setModelo( request.getParameter("txtModelo"));
		novo.setFabricante(request.getParameter("txtFabricante"));
		novo.setAno (request.getParameter("txtAno"));
		novo.setKm (Integer.parseInt(request.getParameter("txtKM")));
		novo.setValorTarifaKM ( Double.parseDouble (request.getParameter("txtTarifaLivre")));
		novo.setValorTarifaLivre ( Double.parseDouble(request.getParameter("txtTarifaKm")));
		 
		novo.cadastrar();
		
		return "frmListaVeiculo.jsp";
		
	}
	
}
