package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Veiculo;


public class VeiculoPostgreSqlDao implements VeiculoDao{
	
	public String cadastrar(Veiculo novoVeiculo) {
		
		String sqlInsert = "INSERT INTO TB_Veiculo(chassi, placa, cidade, estado, " + 
					"grupo, modelo, fabricante, ano, km, valortarifalivre, valortarifakm) " + 
					" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		
		Connection conn = null;
		PreparedStatement stm = null;	
		
		try
		{
			//Obtem a conexão
			conn = AcessoBD.obtemConexao();
			
			stm = conn.prepareStatement(sqlInsert);	
			
			stm.setString(1, novoVeiculo.getChassi());
			stm.setString(2, novoVeiculo.getPlaca());
			stm.setString(3, novoVeiculo.getCidade());
			stm.setString(4, novoVeiculo.getEstado());
			stm.setString(5, novoVeiculo.getGrupo());
			stm.setString(6, novoVeiculo.getModelo());
			stm.setString(7, novoVeiculo.getFabricante());
			stm.setString(8, novoVeiculo.getAno());
			stm.setInt (9, novoVeiculo.getKm());
			stm.setDouble (10, novoVeiculo.getValorTarifaLivre());
			stm.setDouble (11, novoVeiculo.getValorTarifaKM());
			
			
			return "Veículo de Placa: " + novoVeiculo.getPlaca() + ", Cadastrado com sucesso.";
			
		}
		
		catch (Exception e)	
		{
			e.printStackTrace();
			
			try
			{
				conn.rollback();
				
				return "ERRO";
				
			}
			catch (SQLException sqlEx)
			{
	
				
				return "ERRO";
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

					return "ERRO";
				}
			}
		}
	}	
	
	public List<Veiculo>  obterVeiculos (String strPlaca, String strChasse){
		
		ArrayList<Veiculo> resultado = new ArrayList<Veiculo>();
		java.sql.Connection conn = null;
		
		String sqlSelect;
		
		
		PreparedStatement stm =  null; 
		ResultSet rs = null;
		
		sqlSelect = "SELECT id, chassi, placa, cidade, estado, grupo, modelo, fabricante, ano, km, " +
					"valortarifalivre, valortarifakm FROM tb_veiculo WHERE placa like  ? AND chassi  like ?";
		
		if(strPlaca==""){strPlaca = "%";}
		if(strChasse==""){strChasse = "%";}

		try
		{
			conn =  AcessoBD.obtemConexao();
					
			stm = conn.prepareStatement(sqlSelect); 
			stm.setString(1, strPlaca);
			stm.setString(2, strChasse);
						
			rs = stm.executeQuery();
			
			while (rs.next()){
							
				Veiculo veiculo = new Veiculo();
				
				veiculo.setId(rs.getInt(1));
				veiculo.setChassi(rs.getString(2));
				veiculo.setPlaca(rs.getString(3));
				veiculo.setCidade(rs.getString(4));
				veiculo.setEstado(rs.getString(5));
				veiculo.setGrupo(rs.getString(6));
				veiculo.setModelo(rs.getString(7));
				veiculo.setFabricante(rs.getString(8));
				veiculo.setAno(rs.getString(9));
				veiculo.setKm(rs.getInt(10));
				veiculo.setValorTarifaKM (rs.getDouble(11));
				veiculo.setValorTarifaLivre (rs.getDouble(12));	
				
				resultado.add(veiculo);
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
