package atividades;

import java.util.Scanner;

public class Peixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o peso dos peixes? ");
		int peso = entrada.nextInt();

		if (peso > 50) {
			int excesso = peso - 50;

			int multa = excesso * 4;

			System.out.println("Valor da multa R$: " + multa);
		} else {
			System.out.println("Não será necessário pagar multa.");

		}

	}

}
