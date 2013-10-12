<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="model.PessoaJuridica"%>
<%@page import="command.CommandClienteJuridicoAlterar"%>
<%@page import="java.util.List"%>
<html>

	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Sistema Gerenciador de Locaçao de Carros</title>
		
		<link href="CSS/geral.css" rel="stylesheet" type="text/css"/>
		<link href="CSS/menu.css" rel="stylesheet" type="text/css">
		
	
		<style type="text/css">
		.auto-style1 {
			margin-left: 0px;		
		}
		.auto-style2 {
			margin-left: 7px;
		}
		.auto-style3 {
			text-align: right;
		}
		</style>		
			
	</head>
	
	<body>
		
		<jsp:useBean id="selecionarClienteJuridico" class="model.PessoaJuridica" scope="session"/>
		
		<form action="fc" method="POST">
	
			<input type="hidden" name="operacao" value="PessoaJuridicaAtualizado">
			
			<div class="auto-style1" style="width: 732px">
			
				<div id='cssmenu'>
					
					<ul>
					
						<li class='active'><a href='Menu.jsp'><span>Inicio</span></a></li>
						
						<li> <a href='xxxxx'><span>Fazer Locação</span></a></li>
						
						<li><a href='xxxxx'><span>Devolução</span></a></li>			
						
						<li class='has-sub'><a href='#'><span>Cadastrar Novo...</span></a>				
						
							<ul>
							
								<li><a href='VeiculoCadastrar.jsp'><span>Veículo</span></a></li>
								
								<li><a href='PessoaFisicaCadastrar.jsp'><span>Clientes Pessoa Fisica</span></a></li>
								<li><a href='PessoaJuridicaCadastrar.jsp'><span>Clientes Pessoa Juridica</span></a></li>
							</ul>
							
						</li>	
							
						<li class='has-sub'>
						<a href='#' style="left: 0px; top: 0px; width: 72px"><span>Consultar</span></a>
							<ul>
						
								<li><a href='xxxxx'><span>Cliente</span></a></li>
								
								<li><a href='VeiculoLista.jsp'><span>Veículo</span></a></li>
								
							</ul>
							
						</li>
						
						<li> 
						<a href='xxxxx' style="left: 2px; top: -1px; width: 67px"><span>Ajuda</span></a></li>
	
						
					</ul>
				
				</div>
				<br>
				<br>				
				<div>
				
					<table  align="right" style="width: 100%; font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: small;" bgcolor="#CCCCFF">
						<tr>
						   
						      <td class="auto-style3">id </td>
						    <td><input readonly="true" type="text" maxlength="50" size="5" tabindex="1" name="id"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='id' />"></td>
						
                         </tr>
						<tr>
						
							<td class="auto-style2" style="width: 132px">Nome Fantasia:</td>
							
							<td style="width: 193px">	
							<td><input  type="text" maxlength="51" size="5" tabindex="1" name="txtNomeFantasia"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='nomeFantasia' />"></td>
							
							<td class="auto-style2" style="width: 101px">E-mail:</td>
							<td><input   type="text" maxlength="51" size="5" tabindex="1" name="txtEmail"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='email' />"></td>
							
						</tr>
						<tr>
							<td class="auto-style2" style="width: 132px; height: 26px">Razão Social:</td>
							<td><input   type="text" maxlength="51" size="50" tabindex="1" name="txtRazaoSocial"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='razaosocial' />"></td>
							
							
							
							<td class="auto-style2" style="width: 101px; height: 26px">Telefone:</td>  
							<td><input   type="text" maxlength="51" size="5" tabindex="1" name="txtTelefone"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='telefone' />"></td>
						
						</tr>
						<tr>
						
						
							<td class="auto-style2" style="width: 132px; height: 26px;">CNPJ:</td>
							<td style="width: 193px; height: 26px;">
							<td><input   type="text" maxlength="51" size="5" tabindex="1" name="txtCnpj"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='cnpj' />"></td>
						
							
							
							
							<td class="auto-style2" style="width: 101px; height: 26px;">Endereço:</td>
							<td style="height: 26px">
							<td><input type="text" maxlength="51" size="5" tabindex="1" name="txtEndereco"
						value="<jsp:getProperty name='selecionarClienteJuridico' property='endereco' />"></td>
						
						</tr>
						<tr>
							<td colspan="1" class="auto-style2" style="width: 132px">
							&nbsp;</td>
							<td style="width: 193px">
							&nbsp;</td>
							<td class="auto-style2" style="width: 101px">
							<input name="Alterar " type="submit" value="PessoaJuridicaAtualizado" style="width: 100px"></td>
							<td>&nbsp;</td>
						</tr>
					</table>
				
				</div>			
				
			</div>
			
		</form>
						
	</body>
	
</html>