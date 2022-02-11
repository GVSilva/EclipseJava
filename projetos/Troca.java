package projetos;

import java.util.Scanner;

public class Troca {

	public static void main (String []Args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor de A: ");
		int A = entrada.nextInt();
		System.out.print("Valor de B: ");
		int B = entrada.nextInt();
		
		 int Troca = A;
		 A = B;
		 B = Troca;
		 
		 System.out.printf("A = " + A + "\n B = " +B);
		
	}
}
