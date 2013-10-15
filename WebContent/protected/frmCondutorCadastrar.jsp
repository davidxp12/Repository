<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="model.Condutor"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.PessoaJuridica"%>
<%@page import="java.util.ArrayList"%>
 
<html>
<script language="JavaScript">
function executar(form,operacao){
	
	form.operacao.value = operacao;
	
	
	var obj = document.getElementById('txtPessoaJuridica');

	if(operacao =='cadastrarCondutor'){
    	
	 if (obj.options[obj.selectedIndex].value == '')
	  {
		  
		 
  	      alert("Por favor, dever ser selecionado a pessoa juridica do condutor!" + " " + obj.options[obj.selectedIndex].value);
  	      
     }else{
         
    	  alert( "Condutor cadastrado com sucesso!");
    	  
    	  //var obj2 = document.getElementById('txtPessoaJuridica');
    	  //obj2 = obj.options[obj.selectedIndex].value;

  	    form.submit();
	
	  }
	}
}
	</script>


	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Sistema Gerenciador de Locaçao de Carros </title>
		
		<link href="CSS/geral.css" rel="stylesheet" type="text/css"/>
		<link href="CSS/menu.css" rel="stylesheet" type="text/css">
		
	
		<style type="text/css">
		.auto-style2 {
			margin-left: 7px;
		}
		.auto-style3 {
			text-align: right;
		}
		</style>	
			
	</head>
	
	<body>
	         <% 
			//<jsp:useBean id="pessoasJuridicas" class="model.PessoaJuridica" scope="session"/>-->
			%>
			
		<form action="fc" method="Post">
			
			<input type="hidden" name="operacao" value="cadastrarCondutor">
			
			<div class="auto-style2" style="width: 732px">
			
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
								<li><a href='CondutorConsultara.jsp'><span>Condutor</span></a></li>
							</ul>
							
						</li>
						
						<li> 
						<a href='xxxxx' style="left: 2px; top: -1px; width: 67px"><span>Ajuda</span></a></li>
	
						
					</ul>
				
				</div>
				<br>
				<br>
							
				<div style="font-family: verdana, Geneva, Tahoma, sans-serif; font-size: small; width: 469px; background-color: #E3EED7; background-repeat: no-repeat; height: 182px;" class="auto-style2">
				
			    <table width="518">
						<tr>
						
							<td width="92" class="auto-style3" style="width: 87px">Nome:</td>
							<td width="246"><input name="txtNome" type="text" id="txtNome" size="20" maxlength="50"/></td>
						
						</tr>
						
						<tr>
						
							<td style="width: 87px" class="auto-style3">Cpf:</td>
							<td><input name="txtCpf" type="text" id="txtCpf" size="20" maxlength="50"/></td>
							
							<td width="105" class="auto-style3" style="width: 105px">RG:</td>
							<td width="161" colspan="2" style="width: 42px"><span style="height: 29px">
							  <input name="txtRg" type="text" id="txtRg" style="width: 127px" size="20" maxlength="30"/>
							</span></td>
							
							
							
						</tr>
					
						<tr>
						
							<td height="33" class="auto-style3" style="width: 87px; height: 29px">Passaporte:</td>
							<td style="height: 29px"><input name="txtPassaporte" type="text" maxlength="20" size="20"/> </td>
							
							<td class="auto-style3">Sexo:</td>
							
							<td><select name="cboSexo" style="width: 97px" >
							<option value="M">Masculino</option>
							<option value="F">Feminino</option>
							</select>
							</td>
							
						</tr>
						
						<tr>
						  <td style="width: 87px; height: 32px;" class="auto-style3">Data de Nascimento</td>
						  <td style="height: 32px"><input name="txtDataNascimento" type="text" id="txtDataNascimento" /></td>
						  <td style="width: 105px; height: 32px;" class="auto-style3">
						  Pessoa Juridica</td>
						  <td style="height: 32px">
						  <select name="cboPessoaJuridica" id="txtPessoaJuridica" style="width: 158px"  />
						  <option value="">Selecione Pessoa Juridica</option>
						  	 
						  <%
						//value="<jsp:getProperty name='pessoasJuridicas' property='nome'
						List retorno = (ArrayList)request.getSession().getAttribute("pessoasJuridicas");
							for(Iterator<PessoaJuridica> it = retorno.iterator(); it.hasNext(); ) {
								PessoaJuridica c = (PessoaJuridica)it.next();
									
								System.out.println(c.getNome() );
								
						%>	
						    <option value="<%=c.getId()%>"> <%=c.getNome()%></option>
						<%
							} 	
						%>
						  </select></td>
				  </tr>
						<tr>
						  <td style="width: 87px" class="auto-style3">Numero da Habilita&ccedil;&atilde;o</td>
						  <td><input name="txtHabilitacao" type="text" id="txtHabilitacao" /></td>
						  <td style="width: 105px" class="auto-style3"><span class="auto-style3" style="width: 105px">
						  <span style="width: 105px">Categoria:</span></span></td>
						  <td><span style="width: 42px">
						    <input name="txtCategoria" type="text" id="txtCategoria" size="4" maxlength="3" style="width: 66px"/>
						  </span></td>
				  </tr>
						<tr>
							
							<td style="width: 87px" class="auto-style3"><span class="auto-style3" style="width: 87px">
							<span style="width: 87px">Estado Emissor:</span></span></td>
							<td><input name="txtEstadoEmissor" type="text" id="txtEstadoEmissor" /> </td>
							
							
							<td style="width: 105px" class="auto-style3"><span class="auto-style3" style="width: 87px">
							<span style="width: 87px">Validade:</span></span></td>
							<td><input name="txtValidade" type="text" id="txtValidade" size="20"/> </td>						
						
						</tr>
						<tr>
							<td colspan="4" align="center">
						
								<Table>
							<tr>
								<td colspan="13" style="width: 257px">
									<INPUT TYPE="button" NAME="cadastrar" Value="cadastrar" style="width: 158px"	 onclick="executar(this.form,'cadastrarCondutor')">
									
								</td>
							</tr>
							    	  
						</table>
							</td>
													
						</tr>			
						
					</table>
					
				</div>
				
				
			</div>
			
		</form>
						
	</body>
	
</html>