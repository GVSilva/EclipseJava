package atvs;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float n1,n2,n3,n4;
		float media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4 = entrada.nextFloat();
		
		media =(n1+n2+n3+n4)/4;
		System.out.println("A media das notas é: "+media);
	}
}