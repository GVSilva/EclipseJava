package atvs;

import java.util.Scanner;

public class Dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome? ");
		String firstname = entrada.next();		
		System.out.print("Qual seu ultimo nome? ");
		String lastname = entrada.next();
		System.out.print("Qual é a sua idade? ");
		int Idade = entrada.nextInt();
		
		System.out.println("Olá " + firstname + " " + lastname + " de " + Idade + " de idade.");
	}

}
