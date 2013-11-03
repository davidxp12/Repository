<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Veiculo"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.Date"%>


<html>


	<head>

	<script language="JavaScript">
		function executar(form,operacao){
				form.operacao.value = operacao;
				form.submit();
		}

        function  Data()   {             
        	java.util.Date data = new java.util.Date(); 
            document.write = data.getDate(); + "/" + data.getMonth(); + "/" + data.getFullYear();;
        }

		
	</script>
	
	<script src="jquery.js" type="text/javascript"></script>
	<script src="jquery.maskedinput.js" type="text/javascript"></script>

        <script>
        	jQuery(function(){
                jQuery("#txtDataDevolucao").mask("99/99/9999");
        	});
        </script>

	
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Locação de Veículo</title>
		
		<style type="text/css">
			.auto-style1 {
				font-family: Verdana, Geneva, Tahoma, sans-serif;
				font-size: xx-small;
			}
			.auto-style3 {
				margin-right: 0px;
			}
			
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

		.auto-style4 {
	text-align: center;
}
.auto-style5 {
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	font-size: xx-small;
	text-align: center;
}

		</style>
		
	</head>
	
	<body onload="Data()" onclick="Data()" onunload="Data()">
	
			<form onload="Data()" method="post" action="fc" onclick="Data()" onunload="Data()">
						
			<div class="auto-style4">
			
			<input type="hidden" name="operacao" value="locarVeiculo" >
			
			<div style="height: 259px;" name="principal" class="auto-style4">
			
				<fieldset style="width: 493px; background-color: #C0C0C0;" class="auto-style3">
				
					<legend class="auto-style1">Cadastrar Locação</legend>	
			
					<table>
					
						<tr>
						
							<td style="width: 186px; height: 23px;" class="auto-style5">Selecione o Veículo</td>
												
							<td style="height: 23px" class="auto-style5">Selecione o Cliente</td>
									
						</tr>			
						
						<tr>
											
							<td style="height: 74px; width: 186px;" colspan="=2" class="auto-style4">
													
								<select name="lstVeiculo" id="lstVeiculo" size="4" multiple="multiple" style="width: 187px" class="auto-style1">
								
									<%
										List retorno  = (ArrayList)request.getSession().getAttribute("listaVeiculos");
									  	for(Iterator<Veiculo> it = retorno.iterator(); it.hasNext(); ) {
									  		Veiculo c = (Veiculo)it.next();
									%>					
								
								    	<option value="<%=c.getId()%>"><%=c.getPlaca() + "/" + c.getAno() + " (" + c.getModelo() + "-" + c.getGrupo() + ")" %></option>
									
									<%}%>	
											
								</select><span class="auto-style1"> </span>		
											
							</td>
										
							
							<td style="height: 74px" class="auto-style4">
													
								<select name="lstCliente" id="lstCliente" size="4" multiple="multiple" style="width: 291px" class="auto-style1">
								
									<%
										List retorno2  = (ArrayList)request.getSession().getAttribute("listaClientes");
									  	for(Iterator<Cliente> it = retorno2.iterator (); it.hasNext(); ) {
									  		Cliente c = (Cliente)it.next();
									%>					
								
								    	<option value="<%=c.getId()%>"><%=c.getNome() + " (" + c.getTipo()  + ")" %></option>
									
									<%}%>	
											
								</select><span class="auto-style1"> </span>		
											
							</td>				
														
						</tr>
									
					</table>
						
						
					<table>
					
						<tr>
							
							<td colspan="4" class="auto-style5">Informações de Locação:</td>
							
							<td colspan="4" class="auto-style5">Informações de Devolução:</td>
							
						</tr>
					
					
						<tr>
						
							<td class="auto-style5">Data:</td>
							
							<td class="auto-style4">
							<input type="text" maxlength="10" size="10" disabled="disabled" readonly="readonly" name="txtDataLocacao" class="auto-style1"></td>
							
							<td class="auto-style5">Hora:</td>
							
							<td class="auto-style4">
							<input type="text" maxlength="5" size="5" disabled="disabled" readonly="readonly" name="txtHoraLocacao" class="auto-style1" ></td>
							
							<td class="auto-style5">Data:</td>
							
							<td class="auto-style4">
							<input type="text" maxlength="10" size="10" name="txtDataDevolucao" class="auto-style1" ></td>
							
							<td class="auto-style5">Hora:</td>
							
							<td style="width: 38px" class="auto-style4">
							<input type="text" maxlength="5" size="5" name="txtHoraDevolucao" class="auto-style1"></td>
							
							<td class="auto-style5">Agência:</td>
							
							<td class="auto-style4">
							<input type="text" maxlength="10" size="10" disabled="disabled" readonly="readonly" style="width: 67px" value="Barueri-SP" class="auto-style1"></td>	
						
						</tr>		
						
					</table>
					
					<table>
					
						<tr>
							<td class="auto-style5">Condutor</td>
							<td class="auto-style5">Tipo de Tarifa:</td>
						</tr>
						
						<tr>
						
							<td style="height: 74px" class="auto-style4">
													
								<select name="lstCondutor" id="lstCondutor" size="4" multiple="multiple" style="width: 321px" class="auto-style1">
								
									<%
									  	for(Iterator<Cliente> it = retorno2.iterator(); it.hasNext(); ) {
									  		Cliente c = (Cliente)it.next();
									  		
											if (c.getTipo().equals("PF")){
									%>					
								
								    	<option value="<%=c.getId()%>"><%=c.getNome() + " (" + c.getTipo()  + ")" %></option>
									
									<%}}%>	
											
								</select><span class="auto-style1"> </span>		
											
							</td>	
									
							<td class="auto-style4">
							<input checked="checked" name="tarifaLivre" type="radio" value="tarifaLivre" class="auto-style1"><span class="auto-style1">Tarifa Livre
							</span>
							<input name="tarifaKm" type="radio" value="tarifaKm" class="auto-style1"><span class="auto-style1">Tarifa KM</span></td>					
							
						</tr>
														
						</table>
					
				</fieldset>
			
		  </div>
				
				
			
			<table style="width: 491px" align="center">
				<tr>
					<td class="auto-style4" style="width: 255px">
					<input name="btnLocar" style="width: 96px" type="submit" value="locarVeiculo"></td>
					<td style="width: 257px" class="auto-style4">
					<input name="Reset1" style="width: 96px" type="reset" value="Limpar"></td>
				</tr>
			</table>
				
				</div>
				
		</form>		
			
	</body>
	
</html>