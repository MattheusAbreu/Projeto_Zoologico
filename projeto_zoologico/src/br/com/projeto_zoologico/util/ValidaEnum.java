package br.com.projeto_zoologico.util;

import br.com.projeto_zoologico.beans.Especie;
import br.com.projeto_zoologico.beans.Habitat;

public class ValidaEnum {

	public static Especie validaEspecie(int id) {

		if (id == Especie.MAMIFERO.getEspecie()) {

			return Especie.MAMIFERO;

		} else if (id == Especie.AVE.getEspecie()) {

			return Especie.AVE;
		} else if (id == Especie.ANFIBIO.getEspecie()) {

			return Especie.ANFIBIO;
		} else if (id == Especie.PEIXE.getEspecie()) {

			return Especie.PEIXE;
		}

		else if (id == Especie.REPTIL.getEspecie()) {

			return Especie.REPTIL;
		}

		return null;

	}

	public static Habitat validaHabitat(int id) {

		if (id == Habitat.FLORESTA.getHabitat()) {
			return Habitat.FLORESTA;
			
		} else if (id == Habitat.DESERTO.getHabitat()) {

			return Habitat.DESERTO;

		} else if (id == Habitat.SAVANA.getHabitat()) {

			return Habitat.SAVANA;

		}

		else if (id == Habitat.PANTANO.getHabitat()) {

			return Habitat.PANTANO;

		}

		else if (id == Habitat.AGUA_DOCE.getHabitat()) {

			return Habitat.AGUA_DOCE;

		}

		else if (id == Habitat.AGUA_SALGADA.getHabitat()) {

			return Habitat.AGUA_SALGADA;

		}
		
		return null;

	}

}
