package atvs;

import java.util.Scanner;

public class Serie {

	public static void main(String[] args) {

		Scanner menu = new Scanner(System.in);
		int opcao = 0;

		System.out.println("Escolha uma das op��es: \n 1- Netflix / 2- Disney+ / 3- HBO / 4-Amazon Prime / 5 - Sair");
		opcao = menu.nextInt();
		
		if (opcao == 1) {
			System.out.println("Voc� escolheu opc�o 1! \n Abrindo Netflix!");
		} else if (opcao == 2) {
			System.out.println("Voc� escolheu opc�o 2! \n Abrindo Disney+!");
		} else if (opcao == 3) {
			System.out.println("Voc� escolheu opc�o 3! \n Abrindo HBO! ");
		} else if (opcao == 4) {
			System.out.println("Voc� escolheu opc�o 4! \n Abrindo Amazon Prime! ");
		} else if (opcao == 5) {
			System.out.println("Voc� escolheu opc�o 5! \n Saindo... ");
		} else {
			System.out.println("Voc� precisa escolher uma das op��es acima! ");
		}
	}
}
