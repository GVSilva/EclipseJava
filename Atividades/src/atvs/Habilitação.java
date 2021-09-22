package atvs;

import java.util.Scanner;

public class Habilitação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome? ");
		String nome = entrada.nextLine();
		System.out.println("Qual é a sua idade? ");
		idade = entrada.nextInt();
		
		if(idade < 1){
			System.out.println(nome+ " Por favor, digite uma idade válida. ");
		} else if(idade < 18) {
			System.out.println(nome+ " é menor de idade, apenas pessoas com 18 anos, podem tirar habilitação.");
		} else {
			System.out.println(nome+ " é maior de idade, já pode tirar a habilitação, parabéns!");
		}
		
	}

}
