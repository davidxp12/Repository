package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Veiculo;

public class ClientePostgreSqlDao implements ClienteDao {

	
	public List<Cliente> obterCliente() {
		
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		java.sql.Connection conn = null;
		
		String sqlSelect;
		
		PreparedStatement stm =  null; 
		ResultSet rs = null;
		
		sqlSelect = "SELECT A.id, A.nome, 'PF' tipo FROM tb_pessoafisica A UNION " +
					"SELECT B.id, B.nome, 'PJ' tipo FROM tb_pessoajuridica B";
		
		try
		{
			conn =  AcessoBD.obtemConexao();
					
			stm = conn.prepareStatement(sqlSelect); 
						
			rs = stm.executeQuery();
			
			while (rs.next()){
							
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setTipo(rs.getString(3));
				
				resultado.add(cliente);
			}
			
			return resultado;
			
		}
			catch (Exception e) {
				e.printStackTrace();
				return resultado;
			}
			finally
			{
				if (stm != null){
					try{
						stm.close();
					}
					catch (Exception e1) {
						System.out.print(e1.getStackTrace());
					}
				}
			}
	}
	
    public List<Cliente>  obterClientes (String strNome, String strCGC){
		
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		java.sql.Connection conn = null;
		
		String sqlSelect;
		
		PreparedStatement stm =  null; 
		ResultSet rs = null;
		
	
		sqlSelect = "SELECT id, nomefantasia,  telefone, email, endereco, 'jurídico' as tipo  FROM tb_clientepj WHERE nomefantasia LIKE ? AND cnpj LIKE ? UNION " +
					"SELECT id, nome, telefone, email, endereco, 'fisíca' as tipo  FROM tb_clientepf WHERE nome LIKE ? AND cpf LIKE ? ;";

		
		
		if(strNome==""){strNome = "%";}
		if(strCGC==""){strCGC = "%";}

		try
		{
			conn =  AcessoBD.obtemConexao();
					
			stm = conn.prepareStatement(sqlSelect); 
			stm.setString(1, strNome);
			stm.setString(2, strCGC);
			stm.setString(3, strNome);
			stm.setString(4, strCGC);			
						
			rs = stm.executeQuery();
			
			while (rs.next()){
							
				Cliente cliente = new Cliente();
				
				cliente.setId( rs.getInt(1));
				cliente.setNome( rs.getString(2));
				cliente.setTelefone( rs.getString(3));
				cliente.setEmail( rs.getString(4));
				cliente.setEndereco( rs.getString(5));
				cliente.setTipo(rs.getString(6));			
				resultado.add(cliente);
			}
			
			return resultado;
			
		}
			catch (Exception e) {
				e.printStackTrace();
				return resultado;
			}
			finally
			{
				if (stm != null){
					try{
						stm.close();
					}
					catch (Exception e1) {
						System.out.print(e1.getStackTrace());
					}
				}
			}
	}
    
	
}
