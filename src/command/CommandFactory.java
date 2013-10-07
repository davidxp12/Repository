package command;

import command.Command;

public class CommandFactory {
	
	public static Command obterCommand(String operacao) throws Exception {
		
		if ("cadastrarVeiculo".equals(operacao)) {
			
			return new CommandCadastrarVeiculo();
			
		} else{
			
			throw new Exception("Não existe command implementado para a operação informada");
		}
	}

}
