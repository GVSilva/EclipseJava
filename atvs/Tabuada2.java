package atvs;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int  limite = 11, resultado;
		
		System.out.print("Qual tabuada você quer resolver? ");
		int numero = entrada.nextInt();
		
		 for (int i = 1; i < limite; i++) {
			resultado = numero * i;
			System.out.println( numero + " * " + i + " = " + resultado);
		}
	}

}
