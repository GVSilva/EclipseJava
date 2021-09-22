package atvs;

import java.util.Scanner;

public class Caso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite um número de 1 a 5: ");
		int num = entrada.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("Você escolheu a opção 1.");
			break;
		case 2: 
			System.out.println("Você escolheu a opção 2.");
			break;
		case 3: 
			System.out.println("Você escolheu a opção 3.");
			break;
		case 4: 
			System.out.println("Você escolheu a opção 4.");
			break;
		case 5: 
			System.out.println("Você escolheu a opção 5.");
			break;
		default:
			System.out.println("Você não escolheu um opção válida.");
		}

	}

}
