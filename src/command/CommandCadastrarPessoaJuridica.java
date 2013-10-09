package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaJuridica;

public class CommandCadastrarPessoaJuridica extends Command {

 
	public String executar(HttpServletRequest req,
			HttpServletResponse response) throws Exception {
		
		PessoaJuridica novo =  new PessoaJuridica();
		
		//novo.setId((Integer.parseInt(req.getParameter("codigo"))));
		novo.setCnpj((req.getParameter("txtCnpj")));
		novo.setNomeFantasia((req.getParameter("txtNomeFantasia")));
		novo.setRazaosocial((req.getParameter("txtRazaoSocial")));
		novo.setEmail((req.getParameter("txtEmail")));
		novo.setTelefone((req.getParameter("txtTelefone")));
		novo.setEndereco((req.getParameter("txtEndereco")));
		
		List<PessoaJuridica> retorno2 = new ArrayList<PessoaJuridica>();

		retorno2 = novo.obterClientesJuridicos("", "");
		req.getSession().setAttribute("ClienteJuridicoLista.jsp",
				retorno2);

		req.getRequestDispatcher("ClienteJuridicoLista.jsp").forward(
				req, response);
		
		
		
		return "frmClienteJuridicoLista.jsp";
	}

}
