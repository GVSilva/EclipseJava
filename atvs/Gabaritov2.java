package atvs;

import java.util.Scanner;

public class Gabaritov2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero = 0, i = 0, aluno = 0, pontos = 0;

		int[] gabarito = new int[5];
		int[] resposta = new int[5];

		System.out.println("******************************************");
		System.out.println("  Sistema para corrigir provas/gabaritos  ");
		System.out.println("******************************************");
		System.out.println(" ");

		for (i = 0; i < gabarito.length; i++) {
			System.out.print("Digite a resposta da questão " + (i + 1)+ ":");
			gabarito[i] = entrada.nextInt();
		}

		System.out.println("\n******************************************");
		System.out.println("Digite a quantidade de Alunos: ");
		numero = entrada.nextInt();

		for (aluno = 1; aluno <= numero; aluno++) {
			pontos = 0;
			
			for (i = 0; i < 5; i++) {
				
				System.out.println("Questão" + (i + 1));
				resposta[i] = entrada.nextInt();
				
				if (resposta[i] == gabarito[i]) {
					pontos = pontos + 1;
				}
			}
			System.out.println("         ");
		System.out.println("Total de pontos: " + pontos);
		}

	}

}
