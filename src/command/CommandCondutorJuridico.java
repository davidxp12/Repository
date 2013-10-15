package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Condutor;

public class CommandCondutorJuridico extends Command {

	 
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		Condutor v = new Condutor();
		
		v.setNome(request.getParameter("txtNome"));
        v.setDatNasc(request.getParameter("txtDataNascimento"));
        v.setNumHabil(request.getParameter("txtHabilitacao"));
	    v.setCatHabil(request.getParameter("txtCategoriaHabilitacao"));
	    v.setSexo(request.getParameter("txtSexo"));
	    v.setValidade(request.getParameter("txtValidade"));
	    
	    System.out.println(request.getParameter("txtPessoaJuridica"));
	    
	   v.setId(Integer.parseInt(request.getParameter("txtPessoaJuridica") == null ? request.getParameter("txtPessoaJuridica") : "1"));  // id do juridico
	   
	    
	    v.cadastrarCondutor();
	    
		return "frmCondutorCadastrar.jsp";   //"frmCondutorListar.jps"
	}

}
