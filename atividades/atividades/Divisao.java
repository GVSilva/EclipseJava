package atividades;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] Args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número :");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o segundo número :");
		double n2 = entrada.nextDouble();

		double tot = n1 / n2;

		System.out.println("Total = " + tot);
	}

}
