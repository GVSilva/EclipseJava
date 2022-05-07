package atividades;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual seu peso? ");
		int peso = entrada.nextInt();
		System.out.println("Qual sua altura? ");
		double altura = entrada.nextDouble();

		double IMC = peso / (altura * altura);

		if (IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("A classificação é Normal.");
		} else if (IMC >= 25 && IMC <= 29.9) {
			System.out.println("A classificação é Sobrepeso.");
		} else if (IMC >= 30) {
			System.out.println("A classificação é Obesidade.");
		} else if (IMC >= 40) {
			System.out.println("A classificação é Obesidade grave.");
		}
		System.out.println("IMC é: " + IMC);
	}

}
