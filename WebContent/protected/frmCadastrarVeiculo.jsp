<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>	
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Cadastrar Veículo</title>
		
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
						
						<td colspan="4" class="auto-style2">
							
							<strong>Cadastro de Veículo
						
						</strong>
						
						</td>
					
					</tr>
					
					<tr>
						
						<td class="auto-style1">
						
							Chassi:
						
						</td>
						
						<td>
						
							<input name="txtChassi" type="text" maxlength="9" size="9" />
						
						</td>
						
						<td class="auto-style1">
						
							Placa:
						
						</td>
						
						<td>
						
							<input name="txtPlaca" type="text" maxlength="7" size="7" />
						
						</td>
						
						
					</tr>
					
					<tr>
						
						<td class="auto-style1">
						
							Cidade:
						
						</td>
						
						<td>
						
							<input name="txtCidade" type="text" maxlength="20" size="20" />
						
						</td>
						
						<td class="auto-style1">
						
							UF:
						
						</td>
						
						<td>
						
							<input name="txtUF" type="text" maxlength="2" size="2" />
						
						</td>
						
					</tr>
					
					<tr>
					
						<td class="auto-style1">
						
							Grupo:
							
						</td>
						
						<td>
						
							<select name="cboGrupo" style="width: 128px">
							
								<option id="Economico">A-Econômico</option>
								<option id="EconomicocomAr">C-Econômico com Ar</option>
								<option id="Intermediario">F-Intermediário</option>
								<option id="IntermediarioWagonEspecial">G - Intermediário Wagon Especial</option>
								<option id="Executivo">H-Executivo</option>
								<option id="Utilitario">I-Utilitário</option>
								<option id="ExecutivoLuxo">K-Executivo Luxo</option>
								<option id="IntermediárioWagon">M - Intermediário Wagon</option>
								<option id="Pickup">N - Pickup</option>
								<option id="4X4Especial">P - 4 x 4 Especial</option>
								<option id="Minivan">R- Minivan</option>
								<option id="Furgao">U-Furgão</option>
								<option id="Blindado">Y-Blindado</option>
								
							</select>
							
						</td>
										
						<td class="auto-style1">
							
							Modelo:
						
						</td>
						
						<td>
							
							<input name="txtModelo" type="text"  maxlength="20" size="20" />
						
						</td>
						
					</tr>
					
					
					<tr>
					
						<td class="auto-style1">
						
							Fabricante:
							
						</td>
				
						<td>
							
							<input name="txtFabricante" type="text"  maxlength="20" size="20" />
						
						</td>
					
				
						<td class="auto-style1">
						
							Ano:
							
						</td>
					
			
						<td>
							
							<input name="txtAno" type="text"  maxlength="4" size="4" />
						
						</td>
					
					</tr>
					
				
					<tr>
					
						<td class="auto-style1">
						
							Km:</td>
				
						<td>
							
							<input maxlength="10" name="txtKM" type="text"></td>
					
				
						<td class="auto-style1">
						
							Tarifa Livre:&nbsp;</td>
					
			
						<td>
							
							<input maxlength="10" name="txtTarifaLivre" type="text"></td>
					
					</tr>
					
				
					<tr>
					
						<td class="auto-style1">
						
							Tarifa Km:
							
						</td>
				
						<td>
							
							<input maxlength="10" name="txtTarifaKm" type="text">
							
						</td>

				
						<td></td>
					
						<td></td>
					
					</tr>
					
					<tr>
					
						<td colspan="2" class="auto-style3">
							
							<input name="btnCadastrar" type="submit" value="Cadastrar" />
						
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