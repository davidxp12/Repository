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
			return new 	CommandCadastrarPessoaFisica();
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
			return null;
		}
		else{
			
			throw new Exception("Não existe command implementado para a operação informada");
		}
	}

}
