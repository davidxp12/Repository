package dao;

import model.Locacao;
import java.util.List;

public interface LocacaoDao {
	
	public boolean cadastrar (Locacao novo);
	
	public boolean alterar (Locacao devolucao);
	
	public List<Locacao> obterLocacoes ();
}
