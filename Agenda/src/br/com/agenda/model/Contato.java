package br.com.agenda.model;

public class Contato {
	
	private int id;
	private String nome;
	private int idade;
	private String dataCadastro;
	
	public int getId(){
		
		return id;
	}
	
	public void setId(int id){
		
		this.id = id;
	}

	public String getNome(){
		
		return nome;
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	}
	
	public int getIdade(){
		
		return idade;
	}
	
	public void setIdade(int idade){
		
		this.idade = idade;
	}
	
	public String getDataCadastro(){
		
		return dataCadastro;
	}
	
	public String setDataCadastro (String dataCadastro){
		
		this.dataCadastro = dataCadastro;
		
		return this.dataCadastro;
		
	}
}
