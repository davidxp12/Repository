package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CondutorDao;
import dao.PessoaJuridicaDao;

public class Condutor extends PessoaJuridica {

	private int idCondutor;

	private String nome;
	private String cpf;
	private String rg;
	private String passaporte;
	private String datNasc;
	private String numHabil;
	private String catHabil;
	private String UF;
    private String sexo;
    private String validade;
 
	
	
	public Condutor() {

	}

	public Condutor(int idCondutor, String nome, String cpf, String rg,
			String passaporte, String datNasc, String numHabil,
			String catHabil, String UF) {

		// this.idCondutor = idCondutor == null ? null : idCondutor;
		this.nome = nome == null ? null : nome;
		this.cpf = cpf == null ? null : cpf;
		this.rg = rg == null ? null : rg;
		this.passaporte = passaporte == null ? null : passaporte;
		this.datNasc = datNasc == null ? null : datNasc;
		this.numHabil = numHabil == null ? null : numHabil;
		this.catHabil = catHabil == null ? null : catHabil;
		this.UF = UF == null ? null : UF;
	}
    
	public void setValidade (String validade)
	{
		this.validade = validade;
	}
	
	public String getValidade()
	{
		return validade;
	}
	
	public void setIdCondutor(int idCondutor) {
		this.idCondutor = idCondutor;
	}

	public int getIdCondutor() {
		return idCondutor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return this.rg;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setDatNasc(String datNasc) {
		this.datNasc = datNasc;
	}

	public String getDatNasc() {
		return datNasc;
	}

	public void setNumHabil(String numHabil) {
		this.numHabil = numHabil;
	}

	public String getNumHabil() {
		return numHabil;
	}

	public void setCatHabil(String catHabil) {
		this.catHabil = catHabil;
	}

	public String getCatHabil() {
		return catHabil;
	}

	public void setUF(String UF) {
		this.UF = UF;
	}

	public String getUF() {
		return UF;
	}
 
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	// só deve ser cadastrado o condutor qnd houver o id do juridico
	public boolean cadastrarCondutor() {

		CondutorDao dao = new CondutorDao();

		if (dao.cadastrar(this) == true) {

			return true;

		} else {

			return false;

		}

	}

	public boolean alterar(Condutor condutorAtualizado) {
		
		CondutorDao dao = new CondutorDao();

		if (dao.alterar(condutorAtualizado) == true) {

			return true;

		} else {

			return false;

		}
		

	}
	
	public void excluir (int idCondutor){
	
		CondutorDao dao = new CondutorDao();

		dao.excluir(idCondutor);

		
	}
	
	public List<Condutor> pesquisarCondutor(int idCondutor , String nome)
	{
		CondutorDao dao = new CondutorDao();

		return dao.pesquisarCondutor(idCondutor , nome);
	}
	
	public List<Condutor> pesquisarCondutor()
	{
		CondutorDao dao = new CondutorDao();

		return dao.pesquisarCondutores();
		
	}
	
}
