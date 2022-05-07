package atividades;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o n° que deseja a tabuada: ");
		int n = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
