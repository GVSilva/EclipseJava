package atividades;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor a ser verificado: ");
		int n = entrada.nextInt();

		if (n % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
	}

}
