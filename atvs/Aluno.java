package atvs;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int x = 0;

		do {

			System.out.println(" 1- para Somar \n 0- para Sair ");
			System.out.print("Digite a opção Desejada: ");
			x = entrada.nextInt();
			System.out.println("");

			if (x == 1){

				System.out.println("Nome do aluno: ");
				String aluno1 = entrada.next();

				System.out.println("Valor da primeira nota: ");
				int nota1 = entrada.nextInt();

				System.out.println("Valor da segunda nota: ");
				int nota2 = entrada.nextInt();

				System.out.println("Valor da terceira nota: ");
				int nota3 = entrada.nextInt();

				System.out.println("Valor da quarta nota: ");
				int nota4 = entrada.nextInt();

				double media = (nota1 + nota2 + nota3 + nota4) / 4;

				if (media >= 7) {
					System.out.println(aluno1 + " está aprovado! media é: " + media);
				} else if (media < 4) {
					System.out.println(aluno1 + " está reprovado. media é: " + media);
				}
				if (media <= 6 && media >= 4) {
					System.out.println(aluno1 + " pode fazer a recuperação! media é: " + media);
				}
				System.out.println(" -------------------");
				System.out.println("");
			}
		} while (x != 0);
		System.out.println("Saindo..");

	}
}
