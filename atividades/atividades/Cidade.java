package atividades;

import java.util.Scanner;

public class Cidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, cidade;
		int idade = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		nome = entrada.nextLine();
		
		System.out.println("Qual a sua cidade? ");
		cidade = entrada.nextLine();

		System.out.println("Qual a sua idade? ");
		idade = Integer.parseInt(entrada.nextLine());

		

		System.out.print("Olá. Meu nome é " + nome + ", sou natural de " + cidade + ", tenho " + idade
				+ " anos e estou aprendendo a programar. ");

	}

}
