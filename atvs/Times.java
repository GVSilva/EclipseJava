package atvs;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int mediaidade=0,idade=0, sexo, time, x = 0, contador = 0;
		int crt = 0, pal = 0, sts = 0, sp = 0;
		int M = 0, F = 0;

		do {
			System.out.println("Digite a opção Desejada");
			System.out.println(" 1- para continuar \n 0- para Sair :  ");
			x = entrada.nextInt();
			System.out.println("");

			if (x == 1) {

				System.out.print("Escolha o número refente a um dos 4 times: "
						+ "\n 1- Corinthians 2- Palmeiras 3- Santos 4- São Paulo :");
				time = entrada.nextInt();

				if (time == 1) {
					crt++;
				} else if (time == 2) {
					pal++;
				} else if (time == 3) {
					sts++;
				} else if (time == 4) {
					sp++;
				}

				System.out.println("Qual seu sexo? 1- M ou  2-F ");
				sexo = entrada.nextInt();
				if (sexo == 1) {
					M++;
				} else if (sexo == 2) {
					F++;
				}
				
				System.out.print("Qual sua idade? ");
				idade = entrada.nextInt();
				System.out.println(" ");
				
				contador++;
				
				mediaidade= idade / contador;
			}

		} while (x != 0);

		System.out.println("Pessoas entrevistadas: " + contador);
		System.out.println("Os entrevistados são " + M + " do sexo Masculino.");
		System.out.println("Os entrevistados são " + F + " do sexo Feminino.");
		System.out.println("Torcem pro Corinthians: " + crt);
		System.out.println("Torcem pro Palmeiras: " + pal);
		System.out.println("Torcem pro Santos: " + sts);
		System.out.println("Torcem pro São Páulo: " + sp);
		System.out.println("A media de idade das pessoas é: " + mediaidade);
	}
}
