package projetos;

import java.util.Scanner;

public class VerificaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int vetor[] = { 1, 3, 5, 7, 9 };
		int i = 0, numero = 0;
		boolean encontrado = false;

		System.out.println("Qual número está a procura: ");
		numero = entrada.nextInt();

		for (i = 0; i < 5; i++) {

			if (vetor[i] == numero) {
				System.out.println("Número encontrado na posição " + i);
				encontrado = true;
			} 

		}
		if (encontrado == false){
		System.out.println("O número não foi encontrado.");			
		}

	}

}
