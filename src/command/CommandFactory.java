package command;

import command.Command;

public class CommandFactory {
	
	public static Command obterCommand(String operacao) throws Exception {
		
		if ("cadastrarVeiculo".equals(operacao)) {
			
			return new CommandCadastrarVeiculo();
			
		}
		
		if ("cadastrarPessoaFisica".equals(operacao)) {
				
			return new CommandCadastrarPessoaFisica();	
				
		}
		
		if ("incluirVeiculo".equals(operacao)){
			
			return new CommandIncluirVeiculo();
		
		}
		
		if ("locarVeiculo".equals(operacao)){
				
			return new CommandLocarVeiculo();
		
		}
		if ("locacaoVeiculo".equals(operacao)){
			
			return new CommandLocacaoVeiculo();
		
		}
		if ("devolucaoVeiculo".equals(operacao)){
			
			return new CommandLocacaoVeiculo();			
							
		}		
		if ("devolverVeiculo".equals(operacao)){
				
			return new CommandDevolverVeiculo();			
							
		}
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
		
		// Command Pessoa Juridica 
		
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
		// Command Condutor
		if("cadastrarCondutor".equals(operacao))
		{
			return new CommandCondutorJuridico();
		}		
		
		
		else {
		
			
			throw new Exception("Não existe command implementado para a operação informada");
			
		}
	}
}