package atvs;

import java.util.Scanner;

public class Dialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual � o seu nome? ");
		String Firstname = entrada.next();		
		System.out.print("Qual seu ultimo nome? ");
		String Lastname = entrada.next();
		System.out.print("Qual � a sua idade? ");
		int Idade = entrada.nextInt();
		
		System.out.println("Ol� " + Firstname + " " + Lastname + " de " + Idade + " de idade.");
	}

}
