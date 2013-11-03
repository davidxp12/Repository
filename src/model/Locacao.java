package model;

import dao.DaoFactory;
import dao.LocacaoDao;
import java.util.List;

public class Locacao {
	
	int intID = 00;
	ItemLocacao item = null;
	String dtLocacao, hrLocacao, agenciaLocacao;
	String status = "";
	
	
	public int getIntID() {
		return intID;
	}
	public void setIntID(int intID) {
		this.intID = intID;
	}
	public ItemLocacao getItem() {
		return item;
	}
	public void setItem(ItemLocacao item) {
		this.item = item;
	}
	public String getDtLocacao() {
		return dtLocacao;
	}
	public void setDtLocacao(String dtLocacao) {
		this.dtLocacao = dtLocacao;
	}
	public String getHrLocacao() {
		return hrLocacao;
	}
	public void setHrLocacao(String hrLocacao) {
		this.hrLocacao = hrLocacao;
	}
	public String getAgenciaLocacao() {
		return agenciaLocacao;
	}
	public void setAgenciaLocacao(String agenciaLocacao) {
		this.agenciaLocacao = agenciaLocacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	
	public Locacao(int intID, ItemLocacao item, String dtLocacao,
			String hrLocacao, String agenciaLocacao, String status) {
		super();
		this.intID = intID;
		this.item = item;
		this.dtLocacao = dtLocacao;
		this.hrLocacao = hrLocacao;
		this.agenciaLocacao = agenciaLocacao;
		this.status = status;
	}
	
	public Locacao() {super();}
	
	public void LocarVeiculo (){
		
		LocacaoDao dao = DaoFactory.obterLocacaoDao();
		dao.cadastrar(this);
		
	}
	public void devolverVeiculo() {
		LocacaoDao dao =  DaoFactory.obterLocacaoDao();
		dao.alterar(this);		
	}	
	
	public List<Locacao> obterLocacoes() throws Exception{
		LocacaoDao dao = DaoFactory.obterLocacaoDao();
		return dao.obterLocacoes();
	}
}
