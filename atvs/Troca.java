package atvs;

import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Valor de A: ");
		a = entrada.nextInt();
		System.out.println("Valor de B");
		b =entrada.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores trocados: A = " + a + " | B = "+ b);
		
		
	}

}
