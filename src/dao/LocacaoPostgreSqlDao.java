package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Locacao;
import model.Veiculo;

public class LocacaoPostgreSqlDao implements LocacaoDao{

	public boolean cadastrar (Locacao novo){
			
		String strSqlQuery = "INSERT INTO tb_locacao(dtemprestimo, hremprestimo, status) VALUES (?, ?, ?);";
					
		Connection conn = null;
		
		PreparedStatement stm = null, stmItem =null;
				
		try	
		
		{
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(strSqlQuery);
			
			stm.setString(1, novo.getDtLocacao());
			stm.setString(2, novo.getHrLocacao());
			stm.setString(3, novo.getStatus());
			
			stm.executeUpdate();
			
			novo.setIntID(buscarIdLocacao());
			
			strSqlQuery = "INSERT INTO tb_itemlocacao(id_locacao, id_veiculo, id_pessoafisica, id_condutor, " +
						  "id_pessoajuridica, dtdevolucao, hrdevolucao, agencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
			
			stmItem = conn.prepareStatement(strSqlQuery);
			
			stmItem.setInt (1, novo.getIntID());			
			stmItem.setInt(2, novo.getItem().getVeiculo().getId());
			stmItem.setInt(4, novo.getItem().getCondutor().getId());
			
			if (novo.getItem().getCliente().getTipo().equals("PF")){
				stmItem.setInt(3, novo.getItem().getCliente().getId());
				stmItem.setInt(5, 0);
			}else{
				stmItem.setInt(5, novo.getItem().getCliente().getId());
				stmItem.setInt(3, 0);
			}
			
			return true;
			
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
			
	}
	
	public int buscarIdLocacao (){
		
		String strQuery = "SELECT MAX(id_locacao) FROM tb_locacao";
		
		Connection conn = null;
		PreparedStatement stm = null;	
		ResultSet rs = null;
		
		try
		{
			
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(strQuery); 
			rs = stm.executeQuery();
			
			while (rs.next()){
				
				return rs.getInt(1);
				
			}
			
		}
		catch (Exception e)	
		{
			e.printStackTrace();
			
			try
			{
				conn.rollback();
				
				return 0;
				
			}
			catch (SQLException sqlEx)
			{
				return 0;
			}
		}
		finally
		{
			if (stm != null)
			{
				try
				{
					stm.close();
					
					return 0;
					
				}
				catch (SQLException sqlEx)
				{
					return 0;
				}
			}
		}
		return 0;	
				
	}
	
	public boolean alterar (Locacao devolucao){
		
		String strSqlQuery = "UPDATE tb_locacao SET status='DEVOLVIDO' WHERE id_locacao = ?;";
		
		Connection conn = null;
		
		PreparedStatement stm = null, stmItem =null;		
				
		try	
		
		{
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(strSqlQuery);
			
			stm.setInt(1, devolucao.getIntID());
			
			stm.executeUpdate();
			
			strSqlQuery = "UPDATE tb_itemlocacao SET dtdevolucao=?, hrdevolucao=? agencia=? WHERE id_locacao = ?;";
			
			stmItem = conn.prepareStatement(strSqlQuery);
			
			stmItem.setInt(4, devolucao.getIntID());
			stmItem.setString(1, devolucao.getItem().getDtDevolucao());
			stmItem.setString(2, devolucao.getItem().getHrDevolucao());
			stmItem.setString(3, devolucao.getItem().getAgencia());
						
			stmItem.executeUpdate();
						
			return true;
			
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
		
	}

	public List<Locacao> obterLocacoes() {
		
		ArrayList <Locacao> resultado = new ArrayList<Locacao>();
		java.sql.Connection conn = null;
		
		String sqlSelect = "";
		
		PreparedStatement stm = null;
		ResultSet rs = null;
		
		sqlSelect = "SELECT id_locacao, dtemprestimo, hremprestimo, status  FROM tb_locacao;";
		
		try
		{
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(sqlSelect);
			
			rs = stm.executeQuery();
			
			while(rs.next()){
				Locacao locacao = new Locacao();
				
				locacao.setIntID(rs.getInt(1));
				locacao.setDtLocacao(rs.getString(2));
				locacao.setHrLocacao(rs.getString(3));
				locacao.setStatus(rs.getString(4));
				resultado.add(locacao);
			}
			return resultado;
		}
		catch(Exception e){
			e.printStackTrace();
			return resultado;
		}
		finally
		{
			if (stm !=null){
				try{
					stm.close();
				}
				catch(Exception e1){
					System.out.print(e1.getStackTrace());
				}
			}
		}
		
		
		
	}
}
