package dao;

import model.Condutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.AcessoBD;

public class CondutorDao {

	public boolean cadastrar(Condutor condutor) {
		boolean sucesso = false;

		String sqlInsert = "INSERT INTO tb_condutor(nome , cpf, rg , datanascimento , idCliente, numeroHabilitacao , "
				+ "categoriahabilitacao , sexo , validade, passaporte,uf) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement stm = null;
		try {

			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlInsert);

			stm.setString(1, condutor.getNome());
			stm.setString(2, condutor.getCpf());
			stm.setString(3, condutor.getRg());
			stm.setString(4, condutor.getDatNasc());
			stm.setInt(5, condutor.getId()); // esse id é o id do juridico
			stm.setString(6, condutor.getNumHabil());
			stm.setString(7, condutor.getCatHabil());
            stm.setString(8, condutor.getSexo());
            stm.setString(9, condutor.getValidade());
            stm.setString(10,condutor.getPassaporte());
            stm.setString(11, condutor.getUF());
          
       
			stm.execute();
			sucesso = true;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				sucesso = false;
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
		return sucesso;
	}

	public boolean alterar(Condutor condutorAtualizado) {
		boolean sucesso = false;

		String sqlInsert = "UPDATE Condutor set  nome = ?, dataNascimento  = ?, numeroHabilitacao  = ? ,"
				+ " categoriaHabilitacao =? , sexo=? , validade=?"+ " WHERE idCondutor = ?";

		Connection conn = null;
		PreparedStatement stm = null;
		try {

			conn = AcessoBD.obtemConexao();
			stm = conn.prepareStatement(sqlInsert);

			// stm.setInt(1, getIdCondutor());
			stm.setString(1, condutorAtualizado.getNome());
			stm.setString(2, condutorAtualizado.getDatNasc());
			stm.setString(3, condutorAtualizado.getNumHabil());
			stm.setString(4, condutorAtualizado.getCatHabil());
			stm.setString(5, condutorAtualizado.getSexo());
			stm.setString(6, condutorAtualizado.getValidade());
			
			stm.setInt(7, condutorAtualizado.getIdCondutor());
			stm.execute();
			sucesso = true;
		} catch (Exception e) {
			sucesso = false;
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
		return sucesso;
	}

	public boolean excluir(int idCondutor) {
		boolean sucesso = false;
		String sqlDelete = "DELETE FROM Condutor WHERE idCondutor = ?";
		Connection conn = null;
		PreparedStatement stm = null;

		try {

			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlDelete);
			stm.setInt(1, idCondutor);

			stm.execute();
			sucesso = true;
		} catch (Exception e) {
			sucesso = false;
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
		return sucesso;
	}

	public List<Condutor> pesquisarCondutor(int idCondutor , String nome){

		ArrayList<Condutor> resultadoPesquisa = new ArrayList<Condutor>();

		String sqlSelect = "SELECT * FROM Condutor where idCondutor="+ idCondutor +"and nome like ?";

		if (nome == "") {
			nome = "%";
		}
		
		PreparedStatement stm = null;
		
		ResultSet rs = null;
		Connection conn = null;

		try {

			conn = AcessoBD.obtemConexao();

			stm = conn.prepareStatement(sqlSelect);
			stm.setString(1, nome);
			
			rs = stm.executeQuery();

			while (rs.next()) {

				Condutor rsc = new Condutor();
				rsc.setIdCondutor(rs.getInt("idCondutor "));
				rsc.setNome(rs.getString("nome"));
				rsc.setDatNasc(rs.getString("dataNascimento"));
				rsc.setNumHabil(rs.getString("numeroHabilitacao"));
				rsc.setCatHabil(rs.getString("categoriaHabilitacao"));
				rsc.setSexo(rs.getString("sexo"));
				rsc.setValidade(rs.getString("validade"));
				
				resultadoPesquisa.add(rsc);

			}

			return resultadoPesquisa;

		} catch (Exception e) {
			e.printStackTrace();
			return resultadoPesquisa;

		}
	}

	public List<Condutor> pesquisarCondutores() {
		ArrayList<Condutor> resultadoPesquisa = new ArrayList<Condutor>();

		String sqlSelect = "SELECT * FROM Condutor";

		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();

			stm = conn.prepareStatement(sqlSelect);

			rs = stm.executeQuery();

			while (rs.next()) {

				Condutor rsc = new Condutor();
				rsc.setIdCondutor(rs.getInt("idCondutor "));
				rsc.setNome(rs.getString("nome"));
				rsc.setDatNasc(rs.getString("dataNascimento"));
				rsc.setNumHabil(rs.getString("numeroHabilitacao"));
				rsc.setCatHabil(rs.getString("categoriaHabilitacao"));
                rsc.setId(Integer.parseInt(rs.getString("idCliente ")));//salva o id juridico que o condutor pertence.
                rsc.setSexo(rs.getString("sexo"));
                rsc.setValidade(rs.getString("validade"));
         
            	resultadoPesquisa.add(rsc);

			}
			return resultadoPesquisa;

		} catch (Exception e) {
			e.printStackTrace();
			return resultadoPesquisa;

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

}
