package model;

public class ItemLocacao {
	
	int intId = 0;
	Veiculo veiculo = null;
	Cliente cliente= null;
	Cliente condutor = null;
	String dtDevolucao = "", hrDevolucao = "", agencia = "";
	
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCondutor() {
		return condutor;
	}
	public void setCondutor(Cliente condutor) {
		this.condutor = condutor;
	}
	public String getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(String dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	public String getHrDevolucao() {
		return hrDevolucao;
	}
	public void setHrDevolucao(String hrDevolucao) {
		this.hrDevolucao = hrDevolucao;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public ItemLocacao(int intId, Veiculo veiculo, Cliente cliente,
			Cliente condutor, String dtDevolucao, String hrDevolucao,
			String agencia) {
		super();
		this.intId = intId;
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.condutor = condutor;
		this.dtDevolucao = dtDevolucao;
		this.hrDevolucao = hrDevolucao;
		this.agencia = agencia;
	}
	public ItemLocacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
}
