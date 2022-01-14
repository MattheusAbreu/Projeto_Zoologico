package br.com.projeto_zoologico.beans;

public class Animal {

	private String nome;
	private int idade;
	private Especie especie;
	private Habitat habitat;
	private String onomatopeia;
	
	
	
	public void setNome(String nome) {
		
		this.nome=nome;
		
	}
	
	public void setIdade(int idade) {
		
		this.idade=idade;
		
	}
	
	public void setEspecie(Especie especie) {
		
		this.especie=especie;
		
	}
	
	public void setHabitat(Habitat habitat) {
		
		this.habitat=habitat;
		
	}
	
	public void setOnomatopeia (String onomatopeia) {
		
		this.onomatopeia=onomatopeia;
		
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public int getIdade() {
		
		return this.idade;
		
	}
	
	public Especie getEspecie() {
		
		return this.especie;
	}
	
	public Habitat getHabitat() {
		
		return this.habitat;
		
	}
	
	public String getOnomatopeia() {
		
		return this.onomatopeia;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
