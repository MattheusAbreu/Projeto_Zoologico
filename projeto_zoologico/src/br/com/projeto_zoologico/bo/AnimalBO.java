package br.com.projeto_zoologico.bo;

import br.com.projeto_zoologico.beans.Animal;
import br.com.projeto_zoologico.util.BancoDeDados;
import br.com.projeto_zoologico.util.ValidaEnum;

public class AnimalBO {

	public static void cadastraAnimal(String nome, int idade, int especie, int habitat, String onomatopeia) {

		Animal animal = new Animal();

		animal.setNome(nome);
		animal.setIdade(idade);
		animal.setEspecie(ValidaEnum.validaEspecie(especie));
		animal.setHabitat(ValidaEnum.validaHabitat(habitat));
		animal.setOnomatopeia(onomatopeia);
		BancoDeDados.inserirAnimal(animal);

	}

}
