package projetos;

import java.util.Scanner;

public class Maiores {
	//Faça um algoritmo que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de 10 pessoas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int i, idade, maiores = 0;
		
		for (i = 0; i < 10; i++) {
			System.out.print("Digite a idade da "+(i+1)+"° pessoa: ");
			idade = entrada.nextInt();
			
			if (idade >=18) {
				
				maiores++;
			}
			
		}
		System.out.println("Foram encontradas "+maiores+" pessoas maiores de 18.");	
	}
}