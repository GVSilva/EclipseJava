package atividades;

import java.util.Scanner;

public class SomaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int cont = 1, s = 0, n = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite o " + cont + "° número: ");
			n = entrada.nextInt();

			s = s + n;
			cont = cont + 1;
		}
		System.out.println("A soma dos 5 números e de " + s);
	}

}
