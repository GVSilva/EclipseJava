package atividades;

import java.util.Scanner;

public class Diferen�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		System.out.println("Qual a idade da sua m�e? ");
		int idadeMae = entrada.nextInt();
		
		System.out.println("Minha m�e � "+(idadeMae-idade)+" anos mais velha do que eu.");
		
	}

}
