package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import model.PessoaFisica;;

public  class CommandCadastrarPessoaFisica extends Command {

	 
	public String executar(HttpServletRequest req,HttpServletResponse response) throws Exception {
		 
		PessoaFisica novo = new PessoaFisica();

		// novo.setId((Integer.parseInt(req.getParameter("codigo"))));
		novo.setNome(req.getParameter("txtNome"));
		novo.setEmail(req.getParameter("txtEmail"));
		novo.setTelefone(req.getParameter("txtTelefone"));
		novo.setCpf(req.getParameter("txtCpf"));
		novo.setSexo(req.getParameter("cboSexo"));
		novo.setCnh(req.getParameter("txtCNH"));
		novo.setDtValidade(req.getParameter("txtDtVencimento"));
		novo.setDtNascimento(req.getParameter("txtDtNascimento"));
		novo.setCategoria(req.getParameter("txtCategoria"));
		novo.setEstadoEmissor(req.getParameter("txtEstadoEmissor"));
		novo.setPassaporte(req.getParameter("txtPassaporte"));
		novo.setEndereco(req.getParameter("txtendereco"));
		novo.setRg(req.getParameter("txtRG"));
		
		return "frmCadastrarPessoaFisica.jsp";  // consulta.jsp
	}

 
 

	 

}
