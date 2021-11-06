package atvs;

import java.util.Scanner;

public class ConversaoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double f, c;
		
		System.out.println("Digite o valor em C: ");
		c = entrada.nextDouble();

		f = c * 1.8 + 32;

		System.out.println("O valor em F é: " + f);
	}

}
