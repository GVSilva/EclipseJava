package atividades;

import java.util.Scanner;

public class Somas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int valor = 0, soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0, escolha = 0;
		int n1 = 0, n2 = 0;
		double n3 = 0, n4 = 0;

		System.out.println("PARA SOMAR DIGITE O VALOR DESEJADO;");
		System.out.println("1PARA SOMA, 2 PARA SUBTRAÇÃO, 3 PARA MULTIPLICAÇÃO, 4 PARA DIVISÃO OU 0 PARA SAIR: ");
		escolha = entrada.nextInt();

		if (escolha == 1) {
			System.out.println("SOME");
			System.out.println("Digite o 1° valor: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o 2° valor: ");
			n2 = entrada.nextInt();

			soma = n1 + n2;

			System.out.println("a soma é: " + soma);
			
		} else if (escolha == 2) {
			
			System.out.println("SUBTRAIA");
			System.out.println("Digite o 1° valor: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o 2° valor: ");
			n2 = entrada.nextInt();

			subtracao = n1 - n2;
			System.out.println("a soma é: " + subtracao);

		} else if (escolha == 3) {
			System.out.println("Digite o 1° valor: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o 2° valor: ");
			n2 = entrada.nextInt();

			multiplicacao = n1 * n2;

		} else if (escolha == 4) {
			System.out.println("Digite o 1° valor: ");
			n3 = entrada.nextDouble();
			System.out.println("Digite o 2° valor: ");
			n4 = entrada.nextDouble();

			divisao = n1 / n2;

		} else if (escolha == 0) {
			System.out.println("Sair.");
		}

	}

}
