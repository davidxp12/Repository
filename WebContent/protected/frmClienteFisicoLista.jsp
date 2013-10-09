<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>

<%@page import="model.PessoaFisica"%>
<%@page import="java.util.ArrayList"%>

<html>

<script language="JavaScript">
		function executar(form,operacao){
				form.operacao.value = operacao;
				form.submit();
		}
	</script>

<head>
		
		<link href="CSS/menu.css" rel="stylesheet" type="text/css">

		<style type="text/css">
				
		
		</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Cliente Fisico</title>
</head>
<body style="width: 698px">
<div id='cssmenu'>
					
					<ul>
					
						<li class='active'><a href='Menu.jsp'><span>Inicio</span></a></li>
						
						<li> <a href='LocacaoCliente.jsp'><span>Fazer Locação</span></a></li>
						
						<li><a href='xxxxx'><span>Devolução</span></a></li>			
						
						<li class='has-sub'><a href='#'><span>Cadastrar Novo...</span></a>				
						
							<ul>
							
								<li><a href='VeiculoCadastrar.jsp'><span>Veículo</span></a></li>
								
								<li><a href='PessoaFisicaCadastrar.jsp'><span>
								Clientes Pessoa Fisica</span></a></li>
								
							</ul>
							
						</li>	
							
						<li class='has-sub'>
						<a href='#' style="left: 0px; top: 0px; width: 72px"><span>
						Consultar</span></a>
							<ul>
						
								<li><a href='xxxxx'><span>Cliente</span></a></li>
								
								<li><a href='xxxxx'><span>Veiculo</span></a></li>
								
							</ul>
							
						</li>
						
						<li> 
						<a href='xxxxx' style="left: 2px; top: -1px; width: 67px"><span>
						Ajuda</span></a></li>
	
						
					</ul>
				
				</div>
				
				<div>
				
					<form  action="fc" method="Post">
						
						<input type="hidden" name="operacao" value="clienteFisicoLista">
						
						<table>
							<tbody style="font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: small">
							<tr>
								<td><label>Nome</label></td>
								<td>
								<input type="text" maxlength="7" size="7" tabindex="0" name="txtNome" style="width: 120px"></td>
							
								<td><label>CGC</label></td>
								<td>
								<input type="text" maxlength="15" size="10" tabindex="1" name="txtCGC" style="width: 120px"></td>
			
							</tr>
							
							<tr>
								<td colspan="2">
								<INPUT TYPE="submit" NAME="pesquisar" Value="Pesquisar" >
								<button type="reset" name="limpar">Limpar</button>
								</td>
							</tr>
							
							</tbody>
						</table>	
						
						<table  style="border: 1px dashed #008000; font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: small; background-color: #CCFFCC;">
							<tr align="center" class="trHeader" style="background-color: #00CC66">
								<td style="width: 18px; height: 20px;"></td>
								<td style="width: 53px; height: 20px;">id</td>
								<td class="tdDados" style="width: 172px; height: 20px;">
								CGC</td>
								<td class="tdDados" style="width: 175px; height: 20px;">
								Nome</td>
								<td class="tdDados" style="width: 175px; height: 20px;">
								Tipo</td> 
					
							</tr>
							<%
							
							List retorno = (ArrayList)request.getSession().getAttribute("listaClientesFisicos");
							
							System.out.println(retorno.size());
							
							for(Iterator<PessoaFisica> it = retorno.iterator(); it.hasNext(); ) {
								PessoaFisica c = (PessoaFisica)it.next();
							%>
							
							<tr align="center" style="border-style: dashed; border-width: 1px">
								<td style="width: 18px">
								<input type="radio" name="item" 
								checked="checked" 
								value="<%=c.getId()%>"></td>
								<td style="width: 53px"><%=c.getId()%></td>
								<td class="tdDados" style="width: 172px"><%=c.getCpf()%></td>
								<td class="tdDados" style="width: 175px"><%=c.getNome()%></td>
							    <td class="tdDados" style="width: 175px"><%="Físico"%></td> 
				            </tr>
							<%
							}
							%>
							
						</table>	
						<Table>
							<tr>
								<td colspan="13" style="width: 257px">
									<INPUT TYPE="button" NAME="incluir" Value="Incluir"onclick="executar(this.form,'IncluirPessoaFisica')">
									<INPUT TYPE="button" NAME="alterar" Value="Alterar" onclick="executar(this.form,'clienteFisicoAlterar')">
									<INPUT TYPE="button" NAME="detalhar" Value="Detalhar"onclick="executar(this.form,'clienteFisicoDetalhar')">
									<INPUT TYPE="button" NAME="excluir" Value="Excluir"	onclick="executar(this.form,'clienteFisicoExcluir')">
								</td>
							</tr>
							    	  
						</table>

						
					</form>
					
				</div>
				

</body>
</html>