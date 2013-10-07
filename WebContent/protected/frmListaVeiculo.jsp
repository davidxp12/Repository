	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
		
		<title>Veículos </title>
		
		<style type="text/css">
		
			#principal{
				width: 42%;
				margin: 0px auto;
				background-color: #C6E2FF;
			}	
			
			body {
				margin:0;
				padding:0;
				font-size: 9;
				font-style: normal;
				font-family: verdana;	
				background-color: #eeeeee;					
				}			
			.tableDados {
				table-layout: auto;
				border-collapse: collapse;
				border-color: #EFFBFB;
				border-width: 1;
				border-style: solid;
				width: 540px;	
				font-size: 9;
			}
			.tdDados {
				border-color: #EFFBFB;
				border-width: 1;
				border-style: solid;
				font-size: 9;

			}
			.trHeader{
				border-color: #EFFBFB;
				background-color: #EFFBFB;
				border-width: 1;
				border-style: solid;
				font-size: 9;
			}	

			.parametros{
				font-size: 9;
				font-style: normal;
				font-family: verdana;				
			}
		</style>
	
	</head>

	<body>
		
		<form>
		
			<br>
			
			<div id = "principal">
				
				<fieldset>
					
					<legend>Lista de Veículos Cadastrados </legend>
					
					<table class = "parametros">
						
						<tr>
							
							<td> Placa: </td>
							<td> <input type="input" name="txtPlaca" size ="7" maxlength = "7"> </td>
							
							<td> Chassi: </td>
							<td> <input type="input" name="txtChassi" size ="11" maxlength = "11"> </td>	
							<td> <input type="submit" name="btnPesquisar" value = "Pesquisar" > </td>	
						
						</tr>
						
						<tr>
							<td> </td>
							<td> </td>
							<td> </td>
						</tr>
						
					</table >
					
					<fieldset>

						<table class="tableDados">
							
							<tr class="trHeader">
								
								<td class="tdDados"></td>
								<td class="tdDados">Código</td>
								<td class="tdDados">Placa</td>
								<td class="tdDados">Chassi</td>
								<td class="tdDados">Grupo</td>
								<td class="tdDados">Tarifa Livre</td>
								<td class="tdDados">Tarifa KM</td>
								<td class="tdDados">Status</td>
							</tr>
							
							<tr>
							
								<td><input type="radio" name="item"="checked"></td>
								<td class="tdDados">00000</td>
								<td class="tdDados">HHX1178</td>
								<td class="tdDados">24884221215</td>
								<td class="tdDados">A-Economico</td>
								<td class="tdDados">R$ 154,11</td>
								<td class="tdDados">R$ 174,15</td>
								<td class="tdDados">Dísponivel</td>
								
							</tr>
							
						</table>
					
					</fieldset>
					
					<br><br>
					
					<fieldset>
						
						<legend> Operações</legend>	
						
						<table class = "parametros">
			
								
							<tr>
												
							
								<td> <input type="submit" name="btnLocar" value = "Locar Veículo" height= "15"> </td>	
								<td> <input type="submit" name="btnCadastrar" value = "Novo" height= "15"> </td>
								<td> <input type="submit" name="btnConsultar" value = "Consultar" height= "15"> </td>
								<td> <input type="submit" name="btnAlterar" value = "Alterar" height= "15"> </td>
								<td> <input type="submit" name="btnExcluir" value = "Excluir" height= "15"> </td>
									
							</tr>
							
						</table>
					
					</fieldset>
					
				</fieldset>
				
			</div>
			
			<br>
			
		</form>
	
	</body>

</html>