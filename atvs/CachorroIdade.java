package atvs;

import java.util.Scanner;

public class CachorroIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade do seu cachorro?");
		int idadeCachorro = entrada.nextInt();
		
		idadeCachorro = idadeCachorro *7;
		
		System.out.println("O seu cachorro tem " +idadeCachorro+" anos.");
	
	}

}
