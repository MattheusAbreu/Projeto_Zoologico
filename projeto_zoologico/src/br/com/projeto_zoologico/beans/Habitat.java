package br.com.projeto_zoologico.beans;

public enum Habitat {
	
	FLORESTA(1),
	DESERTO(2),
	SAVANA(3),
	PANTANO(4),
	AGUA_DOCE(5),
	AGUA_SALGADA(6);
	
	
	private int id;
	
	Habitat(int id) {
		
		this.id=id;
		
		
	}
	
	public int getHabitat() {
		
		return this.id;
		
	}
	
	
	

}
