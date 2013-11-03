<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Devolver Veículo</title>
		<style type="text/css">
		.auto-style1 {
			text-align: right;
		}
		</style>
	</head>
	
	<body style="width: 406px; font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: xx-small;">
	
		<form action="fc" method ="post">
			
		<input type="hidden" name="operacao" value="devolverVeiculo">
			
			<table bgcolor="#C0C0C0">
			
				<tr>
					
					<td class="auto-style1"><label id="lblID">Cód. Locação:</label></td>
					
					<td><input name="txtCodigoLocacao" type="text"/></td>
				
				</tr>
				
				<tr>
				
					<td class="auto-style1">Data de Devolução:</td>
					
					<td>
					<input name="txtDataDevolucao" type="text" disabled="disabled" enableviewstate="true" maxlength="10" readonly="readonly" size="10" style="width: 68px"/></td>
					
					<td>Hora:</td>
					
					<td>
					<input name="txtHoraDevolucao" type="text" disabled="disabled" enableviewstate="true" maxlength="10" readonly="readonly" size="10" style="width: 79px"/></td>
				
				</tr>
				
				<tr>
				
					<td class="auto-style1">Agência:</td>
					
					<td><input name="txtAgencia" type="text"></td>
					
					<td>Valor:</td>
					
					<td><input name="Text2" type="text" style="width: 82px"></td>					
					
				</tr>
				
				<tr>
				
					<td class="auto-style1">Tarifa:</td>
				
					<td><input name="txtTarifa" type="text"></td>
					
					<td>Veículo:</td>
					
					<td>
					<input name="txtVeiculo" type="text" style="width: 84px"></td>
					
				</tr>
			
				<tr>
				
					<td class="auto-style1">
					<input name="btnDevolver" style="width: 111px" type="submit" value="Devolver"></td>
				
					<td>
					<input name="btnCancelar" style="width: 119px" type="reset" value="Cancelar"></td>
					
				</tr>
					
			</table>
			
		</form>
		
	</body>
	
</html>