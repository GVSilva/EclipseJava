package atividades;

import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Verifica�a� de voto ");
		System.out.println("Informe a idade: ");
		int idade = entrada.nextInt();

		if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Vota��o � opcional");
		} else if (idade < 16) {
			System.out.println("Vota��o proibida");
		} else {
			System.out.println("Vota��o obrigat�ria");
		}
	}
}
