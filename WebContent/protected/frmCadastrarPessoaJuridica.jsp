<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			text-align: right;
		}
		</style>	
			
	</head>
	
	<body>
		
		<form action="fc" method="post">
	
			<input type="hidden" name="operacao" value="cadastrarPessoaJuridica">
			
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
							<td class="auto-style2" style="width: 132px">Nome 
							Fantasia:</td>
							<td style="width: 193px">
							<input name="txtNomeFantasia" type="text" maxlength="50"  size="80" style="width: 193px"/></td>
							<td class="auto-style2" style="width: 101px">E-mail:</td>
							<td>
							<input name="txtEmail" style="width: 244px" type="text"></td>
						</tr>
						<tr>
							<td class="auto-style2" style="width: 132px; height: 26px">Razão Social:</td>
							<td style="width: 193px; height: 26px">
							<input name="txtRazaoSocial" type="text" maxlength="15" size= "40" style="width: 191px" /></td>
							<td class="auto-style2" style="width: 101px; height: 26px">Telefone:</td>
							<td style="height: 26px">
							<input name="txtTelefone" style="width: 143px" type="text"></td>
						</tr>
						<tr>
							<td class="auto-style2" style="width: 132px; height: 26px;">CNPJ:</td>
							<td style="width: 193px; height: 26px;">
							<input name="txtCnpj" type="text" maxlength="15" size= "40" style="width: 191px" /></td>
							<td class="auto-style2" style="width: 101px; height: 26px;">
							Endereço:</td>
							<td style="height: 26px">
							<input name="txtEndereco" style="width: 237px" type="text"></td>
						</tr>
						<tr>
							<td colspan="1" class="auto-style2" style="width: 132px">
							&nbsp;</td>
							<td style="width: 193px">
							&nbsp;</td>
							<td class="auto-style2" style="width: 101px">
							<input name="cadastrar" type="submit" value="cadastrarPessoaJuridica" style="width: 100px"></td>
							<td>&nbsp;</td>
						</tr>
					</table>
				
				</div>			
				
			</div>
			
		</form>
						
	</body>
	
</html>