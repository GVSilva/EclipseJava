package atvs;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se ele é par ou ímpar: ");
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número "+ num +" é Par.");
		} else{
			System.out.println("O número " + num +" é Ímpar.");
			
		}
	}
}
