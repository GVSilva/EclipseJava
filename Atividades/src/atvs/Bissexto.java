package atvs;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano, para verificar se � bissexto: ");
		int ano = entrada.nextInt();
		
		if(( ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " � bissexto.");
		} else {
			System.out.println("O ano " + ano + " n�o � bissexto.");
		}

	}

}
