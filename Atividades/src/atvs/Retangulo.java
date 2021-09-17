package atvs;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int base= 7, altura = 2, areaRetangulo;

		System.out.println("Digite a Base do retangulo: ");
		base = entrada.nextInt();
		System.out.println("Digite a altura do retangulo: ");
		altura = entrada.nextInt();
		
		areaRetangulo = base * altura;
		System.out.println("A área do retangulo é de : "+ areaRetangulo);
	}

}
