package atvs;

import java.util.Scanner;

public class Habilita��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome? ");
		String nome = entrada.nextLine();
		System.out.println("Qual � a sua idade? ");
		idade = entrada.nextInt();
		
		if(idade < 1){
			System.out.println(nome+ " Por favor, digite uma idade v�lida. ");
		} else if(idade < 18) {
			System.out.println(nome+ " � menor de idade, apenas pessoas com 18 anos, podem tirar habilita��o.");
		} else {
			System.out.println(nome+ " � maior de idade, j� pode tirar a habilita��o, parab�ns!");
		}
		
	}

}
