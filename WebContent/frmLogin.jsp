	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			
			<title>Atendente - Inserir seus dados de Login</title>
			
			<style type="text/css">
			.auto-style1 {
				text-align: center;
			}
			.auto-style2 {
	text-align: right;
}
			</style>
		</head>
		<body>
			
			<form method="post" action="login">
			
				<table align="center" style="font-family: Verdana, Geneva, Tahoma, sans-serif; font-size: x-small" bgcolor="#C0C0C0" border="1">
				
					<tr>
					
						<td>
							<table>
														
								<tr>
									
									<td colspan="2" class="auto-style1">
										
										Tela de Login
									
									</td>				
								
								</tr>
								
								<tr>
									
									<td class="auto-style2">
										
										Login:
									
									</td>
									
									<td>
										
										<input name="txtLogin" type="text" maxlength="10" size="20" />
									
									</td>
									
								</tr>
								
								<tr>
									
									<td class="auto-style2">
										
										Senha:
									
									</td>
									
									<td>
										
										<input name="txtSenha" type="password" maxlength="10" size="20" />
									
									</td>
									
								</tr>
								
								<tr>
								
									<td colspan="2" class="auto-style1">
									
										<input name="btnEntrar" type="submit" value="entrar" style="width: 69px" />
									
									</td>
								
								</tr>
													
							</table>
							
						</td>
					
					</tr>
					
				</table>
				
			</form>
			
		</body>
		
	</html>