package projetos;

import java.util.Scanner;

public class VerificaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int vetor[] = { 1, 3, 5, 7, 9 };
		int i = 0, numero = 0;
		boolean encontrado = false;

		System.out.println("Qual n�mero est� a procura: ");
		numero = entrada.nextInt();

		for (i = 0; i < 5; i++) {

			if (vetor[i] == numero) {
				System.out.println("N�mero encontrado na posi��o " + i);
				encontrado = true;
			} 

		}
		if (encontrado == false){
		System.out.println("O n�mero n�o foi encontrado.");			
		}

	}

}
