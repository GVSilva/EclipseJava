package atvsFor;

import java.util.Random;
import java.util.Scanner;

public class JogoRandom {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		boolean acertou = false;
		int tentativas = 10;
		int numeroSecreto = random.nextInt();
		long chute = 0;
		
		System.out.println(numeroSecreto);
		while(tentativas > 0 && acertou == false) {
			System.out.println("Qual � o seu chute? ");
			chute = entrada.nextLong();
			
			if(numeroSecreto == chute) {
				System.out.println("Voc� acertou!!");
				acertou = true;			
			} else if (chute < numeroSecreto) {
				--tentativas;
				System.out.println("N�mero muito pequeno, " + tentativas + " tentativas restantes." );
			} else {-- tentativas;
			System.out.println("N�mero muito grande, " + tentativas + " tentativas restantes.");
		
			}
		}	
	}
}
