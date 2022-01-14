package br.com.projeto_zoologico.main;

import java.util.Scanner;

import br.com.projeto_zoologico.beans.Animal;
import br.com.projeto_zoologico.bo.AnimalBO;
import br.com.projeto_zoologico.util.BancoDeDados;
import br.com.projeto_zoologico.util.Menu;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcaoEscolhida=-1;
		
		while(opcaoEscolhida!=3) {
			
			Menu.menuPrincipal();
			opcaoEscolhida=scanner.nextInt();
			
			if(opcaoEscolhida==1) {
				scanner.nextLine();
				
				System.out.print("Digite o nome do animal: ");
				String nome=scanner.nextLine();
				
				System.out.print("Digite a idade do animal: ");
				int idade=scanner.nextInt();
				
								
				System.out.println("Digite a especie do animal: ");
				Menu.menuEspecie();
				int idEspecie=scanner.nextInt();
				
				System.out.println("Digite o habitat do animal: ");
				Menu.menuHabitat();
				int idHabitat=scanner.nextInt();
				
				scanner.nextLine();
				System.out.print("Digite a onomatopeia do animal: ");
				String onomatopeia=scanner.nextLine();
				
				AnimalBO.cadastraAnimal(nome, idade, idEspecie, idHabitat, onomatopeia);
				continue;
				

				
				
			}
			
			else if(opcaoEscolhida==2) {
				scanner.nextLine();
				System.out.print("Digite o nome do animal que será consultado: ");
				String nomeAnimal=scanner.nextLine();
				Animal animal;
				try {
					 animal=BancoDeDados.buscarAnimal(nomeAnimal);
				System.out.println(animal.getNome()+" está sendo consultado, ele olha pro veterinario e diz: "+animal.getOnomatopeia());
				} catch (Exception e) {
					System.out.println("Animal não encontrado");
					
				}
			
				
			
				
				
				
				
				continue;
				
				
				
			}
			else if(opcaoEscolhida==3) {
				
				System.exit(0);
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
	}

}
