package command;

import command.Command;

public class CommandFactory {
	
	public static Command obterCommand(String operacao) throws Exception {
		
		if ("cadastrarVeiculo".equals(operacao)) 
		{
			return new CommandCadastrarVeiculo();
		}
	
		// Command Pessoa F�sica.
		
		if("cadastrarPessoaFisica".equals(operacao))
		{
			return new CommandCadastrarPessoaFisica();
		} 
		if("IncluirPessoaFisica".equals(operacao))
		{
			return  new CommandIncluirPessoaFisica(); 
		}
		
		if("clienteFisicoLista".equals(operacao))
		{
			return new CommandClienteFisicoLista();
		}
		if("clienteFisicoAlterar".equals(operacao))
		{
			return new CommandClienteFisicoAlterar();
		}
		
		if("ClienteFisicoatualizar".equals(operacao))
		{
			return new CommandClienteFisicoAtualizar();
		}
		
		if("clienteFisicoDetalhar".equals(operacao))
		{
			return new CommandClienteFisicoDetalhar();
		}
		if("clienteFisicoExcluir".equals(operacao))
		{
			return new CommandClienteFisicoExcluir();
		}
		
		// Pessoa juridica 
		
		if("cadastrarPessoaJuridica".equals(operacao))
		{
			return new CommandCadastrarPessoaJuridica();
		}	
		
		if("clienteJuridicoLista".equals(operacao))
		{
			return new CommandClienteJuridicoLista();
		}
		
		if("IncluirPessoaJuridica".equals(operacao))
		{
			return new CommandClienteJuridicoIncluir();
		}
		if("clienteJuridicoAlterar".equals(operacao))
		{
			return new CommandClienteJuridicoAlterar();
		}
	 
		if("PessoaJuridicaAtualizado".equals(operacao))
		{
			return new CommandClienteJuridicoAtualizar();
		}
		if("clienteJuridicoDetalhar".equals(operacao))
		{
			return new CommandClienteJuridicoDetalhar();
		}
		if("clienteJuridicoExcluir".equals(operacao))
		{
			return new CommandClienteJuridicoExcluir();
		}
		else{
			
			throw new Exception("Não existe command implementado para a operação informada");
		}
	}

	 

}
