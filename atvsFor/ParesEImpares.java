package atvsFor;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int par =0, impar=0;
		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o " +i+"� n�mero: ");
			int num = entrada.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("Par");
				 par=par+1;
			} else {
				System.out.println("�mpar");
				impar=impar+1;
			}
		}
		System.out.println("\nForam contados " + par + " n�meros pares e " + impar + " n�meros impares." );
		
	}

}
