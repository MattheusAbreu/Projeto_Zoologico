package br.com.projeto_zoologico.beans;

public enum Especie {
	
	
	
	MAMIFERO(1),AVE(2),REPTIL(3),ANFIBIO(4),PEIXE(5);
	
	private int id;
	
	Especie(int id) {
		
		this.id=id;
		
	}
	
	
	public int getEspecie() {
		
		return this.id;
	}

}
