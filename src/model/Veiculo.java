package model;

import java.io.Serializable;

import dao.DaoFactory;
import dao.VeiculoDao;


public class Veiculo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3637758993155982792L;

	/** */
	private String chassi;
	
	public Veiculo(String chassi, String placa, String cidade, String estado,
			String grupo, String modelo, String fabricante, String ano,
			Integer km, double valorTarifaLivre, double valorTarifaKM) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cidade = cidade;
		this.estado = estado;
		this.grupo = grupo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.km = km;
		this.valorTarifaLivre = valorTarifaLivre;
		this.valorTarifaKM = valorTarifaKM;
	}

	public Veiculo() {
		super();
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public Double getValorTarifaLivre() {
		return valorTarifaLivre;
	}

	public void setValorTarifaLivre(double valorTarifaLivre) {
		this.valorTarifaLivre = valorTarifaLivre;
	}

	public double getValorTarifaKM() {
		return valorTarifaKM;
	}

	public void setValorTarifaKM(double valorTarifaKM) {
		this.valorTarifaKM = valorTarifaKM;
	}

	/** */
	private String placa;
	
	/** */
	private String cidade;
	
	/** */
	private String estado;
	
	/** */
	private String grupo;
	
	/** */
	private String modelo;
	
	/** */
	private String fabricante;
	
	/** */
	private String ano;
	
	/** */
	private Integer km;
	
	/** */
	private double valorTarifaLivre;
	
	/** */
	private double valorTarifaKM;
	
	/** */
	public void cadastrar()  throws Exception {
		
		VeiculoDao dao = DaoFactory.obterVeiculoDao();
		
	}
	
	/** 
	public listaVeiculo consultar() {
	
	}
	*/
	/** */
	public void alterar(Veiculo veiculo) {
	
	}
	
	/** */
	public void deletar(String placa) {
	
	}
	
	/** */
	public void detalhar(String placa) {
	
	}
}
