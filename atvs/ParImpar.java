package atvs;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para verificar se ele � par ou �mpar: ");
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero "+ num +" � Par.");
		} else{
			System.out.println("O n�mero " + num +" � �mpar.");
			
		}
	}
}
