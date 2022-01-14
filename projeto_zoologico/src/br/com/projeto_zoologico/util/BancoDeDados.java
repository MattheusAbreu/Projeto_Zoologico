package br.com.projeto_zoologico.util;

import java.util.HashMap;
import java.util.Map;

import br.com.projeto_zoologico.beans.Animal;



public class BancoDeDados {
	
	
	public static Map<String,Animal> BANCO_DE_DADOS = new HashMap<String,Animal>();
	
	
	public static void inserirAnimal(Animal animal) {
		
		BancoDeDados.BANCO_DE_DADOS.put(animal.getNome(), animal);
		
		
	}
	
	public static Animal buscarAnimal(String nomeAnimal) {
		
		
		Animal animal = BancoDeDados.BANCO_DE_DADOS.get(nomeAnimal);
		
		if (animal==null) {
		
			return null;
		}
		
		return animal;
		
		
		
	}
	
	

}
