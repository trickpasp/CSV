package br.com.pasp.model;

public class RegAgenda {
	private String nome;	
	private String end;
	private String tel;
	private String email;
	
	public RegAgenda(String nome, String end, String tel, String email) {
		this.nome = nome;		
		this.end = end;
		this.tel = tel;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
