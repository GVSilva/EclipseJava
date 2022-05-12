package atividades;

import java.util.Scanner;

public class DoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaa = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int n1 = entradaa.nextInt();
		System.out.println("Digite o primeiro número");
		int n2 = entradaa.nextInt();
		
		int tot = n1 + n2;
		
		System.out.println("O total é: " + tot);
	}

}
