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
	    v.setCatHabil(request.getParameter("txtCategoria"));
	    v.setSexo(request.getParameter("txtSexo"));
	    v.setValidade(request.getParameter("txtValidade"));
	    v.setCpf(request.getParameter("txtCpf"));
	    v.setRg(request.getParameter("txtRg"));
	    v.setPassaporte(request.getParameter("txtPassaporte"));	
	    v.setSexo(request.getParameter("cboSexo"));
	    v.setDatNasc(request.getParameter("txtDataNascimento"));
	    v.setUF(request.getParameter("txtEstadoEmissor"));
	    v.setValidade(request.getParameter("txtValidade"));
	    
	    System.out.println(request.getParameter("cboPessoaJuridica"));
	    
	   v.setId(Integer.parseInt(request.getParameter("cboPessoaJuridica")));  // id do juridico
	  
	   
	    v.cadastrarCondutor();
	    
		return "frmCondutorCadastrar.jsp";   //"frmCondutorListar.jps"
	}

}
