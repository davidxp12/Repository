package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcessoBD {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection obtemConexao() throws SQLException
	{
		//return DriverManager.getConnection("jdbc:mysql://localhost:3309/bd_locadora?user=root&password=123456");
		return DriverManager.getConnection("jdbc:postgresql://localhost:5433/RentalCar", "postgres","123456");	
	}
	
	public static void main (String []args) {

		try {
			AcessoBD.obtemConexao();
			System.out.println("conexão realizada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erro");
		}
	}

}