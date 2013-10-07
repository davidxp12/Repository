package dao;
import java.util.List;

import model.Cliente;


public interface ClienteDao {
	//deve adicionar mais atributos ao cliente
	public List<Cliente>  obterClientes (String strNome, String strCGC);

}
