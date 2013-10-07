package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Veiculo;


public class VeiculoPostgreSqlDao implements VeiculoDao{
	
	public String cadastrar(Veiculo novoVeiculo) {
		
		String sqlInsert = "INSERT INTO tb_veiculo(chassi, placa, cidade, estado, " + 
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
	
}
