package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;

public class LoginDao {

	public boolean consultar (Login login){
		
		String strSqlQuery = "SELECT login, senha  FROM tb_login WHERE login = '" + login.getUsuario() + "'  AND senha = '" + login.getSenha() + "'";
		
		Connection conn = null;
		PreparedStatement stm = null;	
		ResultSet rs = null;
		
		try
		{
			//Obtem a conexão
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(strSqlQuery); 

			rs = stm.executeQuery();
			
			
			while (rs.next()){
				
				return true;
			}
			
		}
		catch (Exception e)	
		{
			e.printStackTrace();
			
			try
			{
				conn.rollback();
				
				return false;
				
			}
			catch (SQLException sqlEx)
			{
								
				return false;
			}
		}
		finally
		{
			if (stm != null)
			{
				try
				{
					stm.close();
										
				}
				catch (SQLException sqlEx)
				{
					
					return false;
				}
			}
		}
		return false;				
		
	}
	
}
