package atvs;

import java.util.Scanner;

public class Dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome? ");
		String Firstname = entrada.next();		
		System.out.print("Qual seu ultimo nome? ");
		String Lastname = entrada.next();
		System.out.print("Qual é a sua idade? ");
		int Idade = entrada.nextInt();
		
		System.out.println("Olá " + Firstname + " " + Lastname + " de " + Idade + " de idade.");
	}

}
