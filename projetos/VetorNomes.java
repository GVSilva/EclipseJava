package projetos;

import java.util.Scanner;

public class VetorNomes {
/* Elabore um algoritmo que armazene em um vetor o nome de 5 convidados de uma festa e exiba o nome dos mesmos.
   Neste exercício não é obrigado a utilizar laço de repetição.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pessoas = new Scanner(System.in);

		String[] conv = new String[5];
		int i = 0, nm = 5;

		System.out.println(" Lista de Convidados ");

		for (i = 0; i < nm; i++ ) {
			System.out.print("Informe o nome do "+(i+1)+" convidado: ");
			conv[i] = pessoas.nextLine();	
		}
		
		for (i = 0; i < nm; i++){
		System.out.println("Os convidados são: " + conv[i]);

		}
	}

}
