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
		.auto-style3 {
			text-align: right;
		}
		.auto-style4 {
	text-align: center;
}
		</style>	
			
	</head>
	
	<body>
		
		<form action="ManterPessoaFisica" method="post">
			
			<input type="hidden" name="operacao" value="cadastrar">
			
			<div class="auto-style1" style="width: 699px; height: 358px;">
			
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
				<br>
							
				<div style="font-family: verdana, Geneva, Tahoma, sans-serif; font-size: small; width: 494px; background-color: #E3EED7; background-repeat: no-repeat; height: 246px;" class="auto-style1">
				
					<table style="width: 490px">
						
						<tr>
						
							<td class="auto-style3">Nome:</td>
							
							<td colspan="3">
							<input name="txtNome" type="text" maxlength="50"  size="50" style="width: 312px"/></td>
													
						</tr>
						
						<tr>
						
							<td class="auto-style3">Telefone:</td>
							
							<td><input name="txtTelefone" type="text" maxlength="15" size= "15" /></td>
							
							<td class="auto-style3" style="width: 108px">E - Mail:</td>
							
							<td style="width: 135px">
							<input name="txtEmail" type="text" maxlength="30" size= "22" style="width: 140px"/></td>
							
													
						</tr>
						<tr>
						
							<td class="auto-style3">CPF:</td>
							
							<td><input name="txtCpf" type="text" maxlength="11" size= "15" /></td>
							
							<td class="auto-style3" style="width: 108px">RG:</td>
							
							<td style="width: 135px">
							<input name="txtRG" type="text" maxlength="14" size= "22" style="width: 140px"/></td>
							
													
						</tr>
						
						<tr>
						
							<td class="auto-style3">Endereço:</td>
							
							<td colspan="3">
							<input name="txtendereco" type="text" maxlength="50"  size="50" style="width: 353px"/></td>
													
						</tr>
						

						<tr>
						
							<td class="auto-style3">Sexo:</td>
							
							<td><select name="cboSexo" style="width: 97px" >
							<option value="M">Masculino</option>
							<option value="F">Feminino</option>
							</select>
							
							<td class="auto-style3" style="width: 108px">Dt. Nasc.:</td>
							
							<td style="width: 135px"><input name="txtDtNascimento" type="text" maxlength="11" size= "22" /></td>
							
													
						</tr>
						
						<tr>
						
							<td class="auto-style3">CNH:</td>
							
							<td><input name="txtCNH" type="text" maxlength="11" size= "15" /></td>
							
							<td class="auto-style3" style="width: 108px">Dt. Venc.:</td>
							
							<td style="width: 135px"><input name="txtDtVencimento" type="text" maxlength="11" size= "22" /></td>
							
						
													
						</tr>
						
						<tr>
						
							<td class="auto-style3" style="height: 14px">Categoria:</td>
							
							<td style="height: 14px">
							<input name="txtCategoria" type="text" maxlength="02" size= "3" style="width: 54px" /> </td>
							
							<td class="auto-style3" style="height: 14px; width: 108px;">UF:</td>
							
							<td style="height: 14px; width: 135px;">
							<input name="txtEstadoEmissor" type="text" maxlength="02" size= "3" style="width: 54px" /></td>

						
						</tr>
						
						<tr>
							
							<td class="auto-style3" style="height: 14px">Passaporte:</td>

							<td style="height: 14px">
							<input name="txtPassaporte" type="text" maxlength="15" size= "15" /></td>

						</tr>
						
						<tr>
							
							<td colspan="4" class="auto-style4">
							
								<input name="btnEnviar" type="submit" value="cadastrar" style="width: 140px" />
							
							</td>
						
						</tr>
					
					</table>
					
				</div>
				
				
			</div>
			
		</form>
						
	</body>
	
</html>