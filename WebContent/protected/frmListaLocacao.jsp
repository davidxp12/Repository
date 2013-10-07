	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
		
		<title>Locações</title>
		
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

	<body style="font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: xx-small">
		
		<form>
			
			<br>
			
			<div id = "principal">
				
				<fieldset>
					
					<legend style="font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: xx-small">Lista de Locações</legend>
					
					<table class = "parametros">
						
						<tr>
							
							<td> Placa-Veículo: </td>
							<td> <input type="input" name="txtPlaca" size ="7" maxlength = "7"> </td>
							
							<td> Código Locação: </td>
							<td> <input type="input" name="txtLocacao" size ="15" maxlength = "11"> </td>	
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
								<td class="tdDados">Veículo</td>
								<td class="tdDados">Dt. Locação</td>
								<td class="tdDados">Dt. Prevista</td>
								<td class="tdDados">Dt. Devolução</td>
								<td class="tdDados">Valor</td>
								<td class="tdDados">Cliente</td>
								<td class="tdDados">Status</td>
							</tr>
							
							<tr>
							
								<td><input type="radio" name="item"="checked"></td>
								<td class="tdDados">000000</td>
								<td class="tdDados">HHX1178</td>
								<td class="tdDados">24/09/2013 14:56:56.000</td>
								<td class="tdDados">26/09/2013 14:56:56.000</td>
								<td class="tdDados"> </td>
								<td class="tdDados">R$ 354,11</td>
								<td class="tdDados">Felipe Dias</td>
								<td class="tdDados">Pendente</td>
								
							</tr>
							
						</table>
					
					</fieldset>
					
					<br><br>
					
					<fieldset>
						
						<legend> Operações</legend>	
						
						<table class = "parametros">
	
								
							<tr>
												
							
								<td> <input type="submit" name="btnDevolver" value = "Fazer devolução" height= "15"> </td>	
								<td> <input type="submit" name="btnLocacao" value = "Nova Locação" height= "15"> </td>
								<td> <input type="submit" name="btnConsultar" value = "Consultar" height= "15"> </td>
								<td> <input type="submit" name="btnCancelar" value = "Cancelar" height= "15"> </td>
									
							</tr>
								
							
						</table>
					
					</fieldset>
					
				</fieldset>
				
			</div>
			
			<br>
			
		</form>
	
	</body>

</html>