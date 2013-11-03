<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>	
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Cadastrar Locação</title>
		
		<style type="text/css">
		.auto-style1 {
			text-align: right;
		}
		.auto-style2 {
			text-align: center;
			font-size: small;
			font-family: Arial, Helvetica, sans-serif;
			color: #808080;
		}
		.auto-style3 {
			text-align: center;
		}
		</style>
		
	</head>
	
	<body>
		
		<form action="fc" method ="post">
		
		<input type="hidden" name="operacao" value="cadastrarVeiculo">
		
			<div>
				
				<table bgcolor="#C0C0C0" border="1" style="font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: xx-small">
				
					<tr>
						
						<td colspan="6" class="auto-style2" style="height: 22px">
							
							<strong>Locação
						
						</strong>
						
						</td>
					
					</tr>
					
					<tr>
						
						<td colspan="3" class="auto-style2">
						
							Veiculo Selecionado</td>	
						
					</tr>
					
					<tr>
						
						<td class="auto-style1" style="width: 107px">
						
							Cod. do Veiculo:
						
						</td>
						
						<td>
						
							<input name="txtIdVeiculo" type="text" maxlength="11" size="12" />
						
						</td>
						
						<td class="auto-style1" style="width: 62px">
						
							Chassi:
						
						</td>
						
						<td>
						
							<input name="txtChassi" type="text" maxlength="11" size="12" />
						
						</td>
						<td class="auto-style1">
						
							Fabricante:
						
						</td>
						
						<td>
						
							<input name="txtFabricante" type="text" maxlength="11" size="12" />
						
						</td>

					</tr>
					
					<tr>
					
						<td class="auto-style1" style="width: 107px">
						
							Modelo:
							
						</td>
						
						<td>
						
							<input name="txtModelo" type="text" maxlength="11" size="12" />
							
								
			
							
						</td>
										
						<td class="auto-style1">
							
							Tarifa Livre:
						
						</td>
						
						<td>
							
							<input name="txtTarifaLivre" type="text"  maxlength="11" size="12" />
						
						</td>
						<td class="auto-style4" style="width: 162px">
						
							Tarifa Controlada:
						
						</td>
						
						<td style="width: 150px">
						
							<input name="txtTarifaCont" type="text" maxlength="11" size="12" />
						
						</td>

						
					</tr>
					
					
					<tr>
					
						<td colspan="3" class="auto-style2" >
						
							Dados do Cliente:
							
						</td>
						</tr>
				
				
				
					<tr>
					
						<td class="auto-style1" style="width: 107px" >
						
							CPF/CNPJ:</td>
				
						<td>
							
							<input name="txtCpfCnpj" type="text" maxlength="16" size="17" /></td>
					
				
						<td colspan ="2"class="auto-style3" >
						
							<input name="btnPesquisar" type="reset" value="Pesquisar" />

					</td>
			
						<td colspan ="2" class="auto-style3">
							
							<input name="btnCadastrarCliente" type="reset" value="Cadastrar Cliente" />
					</td>
					</tr>
					
				
					<tr>
					
						<td class="auto-style1" style="width: 107px; height: 30px;">
						
							Nome/Nome Fantasia:
							
						</td>
				
						<td colspan="6">
							
							<input name="txtNome" type="text" maxlength="46" size="47" /></td>

							
									</tr>
					<tr>
						<td colspan="3" class="auto-style2">
						
							Dados da Locação</td>
					</tr>
					<tr>
										
						<td colspan ="2"class="auto-style1" >
							
							Data do Emprestimo:
						
						</td>
						
						<td>
							
							<input name="txtDataEmprestimo" type="text"  maxlength="11" size="12" />
						
						</td>
						<td colspan ="2"class="auto-style1">
						
							Hora do emprestimo:
						
						</td>
						
						<td style="width: 150px">
						
							<input name="txtHoraEmprestimo" type="text" maxlength="11" size="12" />
						
						</td>
						
					</tr>
					
					<tr>
										
						<td colspan =" 2"class="auto-style1" style="height: 30px" >
							
							Data da Devolução:
						
						</td>
						
						<td style="height: 30px" >
							
							<input name="txtDataDevolucao" type="text"  maxlength="11" size="12" />
						
						</td>
						<td colspan="2" class="auto-style1" style="height: 30px">
						
							Hora da Devolução:
						
						</td>
						
						<td style="height: 30px; width: 150px;">
						
							<input name="txtHoraDevolucao" type="text" maxlength="11" size="12" />
						
						</td>
						
					</tr>
					<tr>
						<td colspan="3" class="auto-style4" style="height: 27px" >
						
							Local do Emprestimo:
							
						</td>

					</tr>
					<tr>
					<td class="auto-style1" style="width: 107px">
						
							Pais
						
						</td>
						
						<td>
						
							<input name="txtPaisEmprestimo" type="text" maxlength="11" size="12" />
						
						</td>
						
						<td class="auto-style1" style="width: 62px">
						
							Estado
						
						</td>
						
						<td>
						
							<input name="txtEstadoEmprestimo" type="text" maxlength="11" size="12" />
						
						</td>
						<td class="auto-style1">
						
							Cidade
						
						</td>
						
						<td>
						
							<input name="txtCidadeEmprestimo" type="text" maxlength="11" size="12" />
						
						</td>

					</tr>
					<tr>
						<td colspan="3" class="auto-style4" style="height: 27px" >
						
							Local da Devolução:
							
						</td>

					</tr>
					<tr>
					<td class="auto-style1" style="width: 107px">
						
							Pais
						
						</td>
						
						<td>
						
							<input name="txtPaisDevolucao" type="text" maxlength="11" size="12" />
						
						</td>
						
						<td class="auto-style1" style="width: 62px">
						
							Estado
						
						</td>
						
						<td>
						
							<input name="txtEstadoDevolucao" type="text" maxlength="11" size="12" />
						
						</td>
						<td class="auto-style1">
						
							Cidade
						
						</td>
						
						<td>
						
							<input name="txtCidadeDevolucao" type="text" maxlength="11" size="12" />
						
						</td>

					</tr>
					<tr>
						<td colspan="3" class="auto-style4" style="height: 27px" >
						
							Tipo da Tarifa:
							
						</td>

					</tr>
					<tr>
					<td class="auto-style1"style="width: 107px">
					<input name="RadioKmLivre" type="radio" />
					</td>
					<td class="auto-style4" style="width: 62px">
						
							Km Livre
						
						</td>
					<td class="auto-style1" style="width: 107px">
					<input name="RadioKmCont" type="radio" />
					</td>
					<td colspan="2" class="auto-style4">
						
							Km Controlado
						
						</td>

					</tr>


					
					<tr>
					
						<td colspan="2" class="auto-style3">
							
							<input name="btnCadastrarLocacao" type="submit" value="Cadastrar" />
						
						</td>
						
					
						<td colspan="2" class="auto-style3">
							
							<input name="btnLimpar" type="reset" value="Limpar" />
						
						</td>
						
					
					</tr>
				
				</table>
			
			</div>
		
		</form>
		
	</body>
	
</html>