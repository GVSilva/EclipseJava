package projetos;

import java.util.Scanner;

public class ListaConvidados {
	// Elabore um algoritmo que armazene em um vetor o nome de até 100 convidados de uma festa e exiba o nome dos mesmos. 
	// O usuário deveré informar a quantidade de convidados que deverá ser exibida.

	public static void main(String[] args) {

		Scanner pessoas = new Scanner(System.in);

		int qt = 0, qtConvidados = 0;

		String[] convites = new String[100];

		System.out.println(" ====  LISTA DE CONVIDADOS === ");
		System.out.print("Quantos convidados deseja? (1 a 100)");

		qtConvidados = Integer.parseInt(pessoas.nextLine());

		for (int i = 0; i < qtConvidados; i++) {
			System.out.print((i + 1) + "° nome do convidado: ");
			convites[i] = pessoas.nextLine();
			qt = qt + 1;
		}

		System.out.println("Lista de convidados tem "+ qt+" nomes, eles são: ");
		for (int i = 0; i < qtConvidados; i++) {
		
			System.out.println(convites[i]);
		}

	}

}
