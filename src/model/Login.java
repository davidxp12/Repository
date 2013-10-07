package model;

import dao.LoginDao;

public class Login {
	
	private int ID;
	private String usuario;
	private String senha;
	
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public boolean validarLogin(){
		
		LoginDao dao = new LoginDao ();
		
		if (dao.consultar(this)==true){
			
			return true;
			
		}
		
		else{
			
			return false;
		}
		
	}
}
