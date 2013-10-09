package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PessoaFisica;

public class CommandClienteFisicoAtualizar extends Command {

	public String executar(HttpServletRequest req,
			HttpServletResponse response) throws Exception {
		 
		PessoaFisica novo = new PessoaFisica();

		novo.setId(Integer.parseInt(req.getParameter("id")));
		novo.setNome(req.getParameter("nome"));
		novo.setEmail(req.getParameter("txtEmail"));
		novo.setTelefone(req.getParameter("telefone")); // coloquei o mesmo nome do jsp, recomendavel padronizar com o padrão da tela de cadastro.
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

		if (novo.Atualizar(novo) == true) {

			PessoaFisica pf = new PessoaFisica();

			List<PessoaFisica> retorno2 = new ArrayList<PessoaFisica>();

			retorno2 = pf.obterClientes("", "");
			req.getSession().setAttribute("listaClientesFisicos",
					retorno2);

			//req.getRequestDispatcher("ClienteFisicoLista.jsp").forward(
				//	req, response);
		 
		return "frmClienteFisicoLista.jsp";  // consulta.jsp

		}
		
		return "frmClienteFisicoLista.jsp";  
	}

}
