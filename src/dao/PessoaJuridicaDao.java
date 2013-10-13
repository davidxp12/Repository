package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.AcessoBD;
import model.PessoaFisica;
import model.PessoaJuridica;
 

public class PessoaJuridicaDao {

	public boolean cadastrar(PessoaJuridica novo) {

		String strSqlQuery = "INSERT INTO tb_clientepj( nomefantasia, nomejuridico, telefone, "
				+ "email, endereco, cnpj) VALUES (?, ?, ?, ?, ?, ?);";

		Connection conn = null;

		PreparedStatement stm = null;

		try {
			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(strSqlQuery);

			// stm.setInt(1, novo.getId());
			stm.setString(1, novo.getNomeFantasia());
			stm.setString(2, novo.getRazaosocial());
			stm.setString(3, novo.getTelefone());
			stm.setString(4, novo.getEmail());
			stm.setString(5, novo.getEndereco());
			stm.setString(6, novo.getCnpj());

			stm.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			try {
				conn.rollback();

				return false;

			} catch (SQLException sqlEx) {

				return false;
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();

				} catch (SQLException sqlEx) {

					return false;
				}
			}
		}
	}//
/*
	public List<PessoaJuridica> obterPessoaJuridica(String nomeFantasia,
			String cnpj) {

		ArrayList<PessoaJuridica> resultado = new ArrayList<PessoaJuridica>();
		java.sql.Connection conn = null;

		String sqlSelect;

		PreparedStatement stm = null;
		ResultSet rs = null;

		sqlSelect = "SELECT * FROM tb_clientepj"
				+ " WHERE nomeFantasia like  ? AND cnpj  like ?";

		if (nomeFantasia == "") {
			nomeFantasia = "%";
		}
		if (cnpj == "") {
			cnpj = "%";
		}

		try {
			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlSelect);
			stm.setString(1, nomeFantasia);
			stm.setString(2, cnpj);

			rs = stm.executeQuery();

			while (rs.next()) {
				// setar todos os atributos.
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				pessoaJuridica.setCnpj(rs.getString("cnpj"));
				pessoaJuridica.setNomeFantasia(rs.getString("nomefantasia"));
				// pessoaJuridica.setRazaoSocial(rs.getString("nomefantasia"));
				pessoaJuridica.setTelefone(rs.getString("telefone"));
				pessoaJuridica.setEmail(rs.getString("email"));
				pessoaJuridica.setEndereco(rs.getString("endereco"));
				pessoaJuridica.setId(rs.getInt("id"));

				resultado.add(pessoaJuridica);
			}

			return resultado;

		} catch (Exception e) {
			e.printStackTrace();
			return resultado;
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (Exception e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}
*/
	
	public boolean alterarClienteJuridico(PessoaJuridica pessoaJuridicaAtualizada) {
		
		String sqlInsert = "UPDATE tb_clientepj set nomefantasia = ? , nomejuridico = ?,"
				+ " telefone = ? ,email = ? , endereco = ? ,cnpj = ?  where id = ?";

		Connection conn = null;
		PreparedStatement stm = null;

		try {
			// Obtem a conexão
			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlInsert);

			stm.setString(1, pessoaJuridicaAtualizada.getNomeFantasia());
			stm.setString(2, pessoaJuridicaAtualizada.getRazaosocial());
			stm.setString(3, pessoaJuridicaAtualizada.getTelefone());
			stm.setString(4, pessoaJuridicaAtualizada.getEmail());
			stm.setString(5, pessoaJuridicaAtualizada.getEndereco());
			stm.setString(6, pessoaJuridicaAtualizada.getCnpj());
			stm.setInt(7, pessoaJuridicaAtualizada.getId());

			stm.executeUpdate();

			return true;

		}

		catch (Exception e) {
			e.printStackTrace();

			try {
				conn.rollback();

				return false;

			} catch (SQLException sqlEx) {
				return false;
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();

				} catch (SQLException sqlEx) {

					return false;
				}
			}
		}
	}

	public void excluirClienteJuridico(int id) {

		String sqlDelete = "DELETE FROM tb_clientepj WHERE id = ?";

		java.sql.Connection conn = null;

		PreparedStatement stm = null;

		try {

			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlDelete);

			stm.setInt(1, id);

			stm.execute();

		}

		catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}

	public List<PessoaJuridica> obterClientesJuridicos(String nomeFantasia, String cnpj) {
		
		ArrayList<PessoaJuridica> resultado = new ArrayList<PessoaJuridica>();
		java.sql.Connection conn = null;

		String sqlSelect;

		PreparedStatement stm = null;
		ResultSet rs = null;

		sqlSelect = "SELECT * FROM tb_clientepj WHERE nomejuridico like  ? AND cnpj  like ?";

		if (nomeFantasia == "" &&  cnpj == "" )
		{
		    sqlSelect = "SELECT * FROM tb_clientepf";
		
		    return obterAllClientesJuridicos(sqlSelect);
		
	     }
		
		
		if (nomeFantasia == "" || nomeFantasia == null)
		{
			nomeFantasia = "%";
		}
		
		if (cnpj == "" || cnpj == null) 
		{
			cnpj = "%";
		}

		try {
			
			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlSelect);
			stm.setString(1, nomeFantasia);
			stm.setString(2, cnpj);

			rs = stm.executeQuery();

			while (rs.next()) {

				PessoaJuridica pj = new PessoaJuridica();

				pj.setId(rs.getInt("id"));
				pj.setNomeFantasia(rs.getString("nomefantasia"));
				pj.setNomeJuridico(rs.getString("nomejuridico"));  // razão social
				pj.setTelefone(rs.getString("telefone"));
				pj.setEmail(rs.getString("email"));
				pj.setEndereco(rs.getString("endereco"));
				pj.setCnpj(rs.getString("cnpj"));

				resultado.add(pj);
			}

			return resultado;

		} catch (Exception e) {
			e.printStackTrace();
			return resultado;
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (Exception e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}

	private List<PessoaJuridica> obterAllClientesJuridicos(String sqlSelect) {

		ArrayList<PessoaJuridica> resultado = new ArrayList<PessoaJuridica>();
		java.sql.Connection conn = null;

		PreparedStatement stm = null;
		ResultSet rs = null;

		sqlSelect = "SELECT * FROM tb_clientepj";

		try {
		
			conn = AcessoBD.obtemConexao();
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();

			while (rs.next()) {

				PessoaJuridica pj = new PessoaJuridica();

				pj.setId(rs.getInt("id"));
				pj.setNomeFantasia(rs.getString("nomefantasia"));
				pj.setNomeJuridico(rs.getString("nomejuridico"));  // razão social
				pj.setTelefone(rs.getString("telefone"));
				pj.setEmail(rs.getString("email"));
				pj.setEndereco(rs.getString("endereco"));
				pj.setCnpj(rs.getString("cnpj"));

				resultado.add(pj);
			}

			return resultado;

		} catch (Exception e) {
			e.printStackTrace();
			return resultado;
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (Exception e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}
	public PessoaJuridica getClienteJuridicoById(int id) {

		PessoaJuridica clientepj = new PessoaJuridica();
   	 
		java.sql.Connection conn = null;

		String sqlSelect;

		PreparedStatement stm = null;
		ResultSet rs = null;

		sqlSelect = "SELECT * FROM tb_clientepj WHERE id =?";


		try {
			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlSelect);
			stm.setInt(1,id);
		 
			rs = stm.executeQuery();

			while (rs.next()) {
				
				clientepj.setId(rs.getInt("id"));
				clientepj.setNomeFantasia(rs.getString("nomefantasia"));
				clientepj.setRazaosocial(rs.getString("nomejuridico"));
				clientepj.setTelefone(rs.getString("telefone"));
				clientepj.setEmail(rs.getString("email"));
				clientepj.setEndereco(rs.getString("endereco"));
				clientepj.setCnpj(rs.getString("cnpj"));
 
			}

			return clientepj;

		} catch (Exception e) {
			e.printStackTrace();
			return clientepj;
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (Exception e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}
      
}

