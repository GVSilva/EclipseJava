package projetos;

import java.util.Scanner;

public class Diferenca {

	public static void main (String []Args){
		int A, B, diferenca = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor A : ");
		A = entrada.nextInt();
		System.out.println("Valor B : ");
		B = entrada.nextInt();
		
		if (A > B) {
			diferenca = A - B;
			System.out.println("O maior valor � A com diferen�a de " + diferenca );
		} else {
			diferenca = B - A;
			System.out.println("O maior valor � B com diferen�a de " + diferenca );
		}
		
			}
	
}
