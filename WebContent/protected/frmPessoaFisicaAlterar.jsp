<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="model.PessoaFisica"%>
<%@page import="command.CommandClienteFisicoAlterar"%>
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
	
		<jsp:useBean id="selecionarClienteFisico" class="command.CommandClienteFisicoAlterar" scope="session"/>
		
		<form action="fc" method="POST">
			
			<input type="hidden" name="operacao" value="ClienteFisicoatualizar">
			
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
							
				<div style="font-family: verdana, Geneva, Tahoma, sans-serif; font-size: small; width: 469px; background-color: #E3EED7; background-repeat: no-repeat; height: 182px;" class="auto-style2">
				
						<div style="font-family: verdana, Geneva, Tahoma, sans-serif; font-size: small; width: 494px; background-color: #E3EED7; background-repeat: no-repeat; height: 246px;" class="auto-style1">
				
					<table style="width: 490px">
						
						<tr>
						  <td class="auto-style3">id </td>
                         	<td><input readonly="true" type="text" maxlength="5" size="5" tabindex="1" name="id"
						value="<jsp:getProperty name='selecionarClienteFisico' property='id' />"></td>
                         </tr>
                            <tr>
							<td class="auto-style3">Nome:</td>
							<td>
							 <input type="text" maxlength="20" size="20" tabindex="2" name="nome" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='nome' />"></td>	
						</tr>
						<tr>
						
							<td class="auto-style3">Telefone:</td>
								<td>
							 <input type="text" maxlength="20" size="20" tabindex="2" name="Telefone" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='nome' />"></td>	
							
							</tr>
							<tr>
							<td class="auto-style3" style="width: 108px">E - Mail:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="E-mail" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='email' />"></td>
							
													
						</tr>
						<tr>
						
							<td class="auto-style3">CPF:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="CPF" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='cpf' />"></td>
							
													
						</tr>
							<tr>
							<td class="auto-style3" style="width: 108px">RG:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="RG" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='rg' />"></td>
							
													
						</tr>
						
						<tr>
						
							<td class="auto-style3">Endereço:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="ENDERECO" 
					 	  value="<jsp:getProperty name='selecionarClienteFisico' property='endereco' />"></td>
							
													
						</tr>
						

						<tr>
						
							<td class="auto-style3">Sexo:</td>
							
							<td><select name="cboSexo" style="width: 97px" >
							<option value="M">Masculino</option>
							<option value="F">Feminino</option>
							</select>
						   </td>
							<td class="auto-style3" style="width: 108px">Dt. Nasc.:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="Dt. Nasc" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='dataNascimento' />"></td>
							
													
													
						</tr>
						
						<tr>
						
							<td class="auto-style3">CNH:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="CNH" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='cnh' />"></td>
							
													
						</tr>
							<tr>
							
							<td class="auto-style3" style="width: 108px">Dt. Venc.:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="Dt. Venc" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='datavencimento' />"></td>
							
													
													
						</tr>
						
						<tr>
						
							<td class="auto-style3" style="height: 14px">Categoria:</td>
							<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="Categoria" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='categoria' />"></td>
							
													
						</tr>
							<td class="auto-style3" style="height: 14px; width: 108px;">UF:</td>
						<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="UF" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='uf' />"></td>
							
													
			
					
						
						<tr>
							
							<td class="auto-style3" style="height: 14px">Passaporte:</td>
<td>
							<input type="text" maxlength="20" size="20" tabindex="2" name="Passaporte" 
					 	value="<jsp:getProperty name='selecionarClienteFisico' property='passaporte' />"></td>
							
													
						</tr>
						
						<tr>
							
							<td colspan="4" class="auto-style4">
							
								<input name="btnEnviar" type="submit" value="ClienteFisicoatualizar" style="width: 140px" />
							
							</td>
						
						</tr>
					
					</table>
					
				</div>
				
					
			  </div>
				
				
			</div>
			
		</form>
						
	</body>
	
</html>