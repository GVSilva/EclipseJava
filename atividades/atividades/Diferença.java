package atividades;

import java.util.Scanner;

public class Diferença {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		System.out.println("Qual a idade da sua mãe? ");
		int idadeMae = entrada.nextInt();
		
		System.out.println("Minha mãe é "+(idadeMae-idade)+" anos mais velha do que eu.");
		
	}

}
