package dao;

import java.util.List;

import model.Veiculo;

public interface VeiculoDao {
	
	public String cadastrar (Veiculo novo);
	
	public List<Veiculo> obterVeiculos(String chassi, String placa);
	
}
