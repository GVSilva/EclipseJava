package atividades;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] Args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero :");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero :");
		int n2 = entrada.nextInt();

		int tot = n1 - n2;

		System.out.println("Total = " + tot);

	}
}
