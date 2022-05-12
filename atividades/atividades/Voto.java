package atividades;

import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Verificaçaõ de voto ");
		System.out.println("Informe a idade: ");
		int idade = entrada.nextInt();

		if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Votação é opcional");
		} else if (idade < 16) {
			System.out.println("Votação proibida");
		} else {
			System.out.println("Votação obrigatória");
		}
	}
}
