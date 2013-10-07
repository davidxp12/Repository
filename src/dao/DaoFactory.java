package dao;

public class DaoFactory {

	public static VeiculoDao obterVeiculoDao() {
//		return new VeiculoDaoTxt();
		return new VeiculoPostgreSqlDao();
	}
	
}
