package projetos;

import java.util.Scanner;

public class Matemática {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Calculo de notas Aula de Matemática");
		System.out.print(" Seu nome: ");
		String name = entrada.next();
		System.out.print("Nota 1 :");
		float n1 = entrada.nextFloat(); 
		System.out.print("Nota 2 :");
		float n2 = entrada.nextFloat();
		System.out.print("Nota 3 :");
		float n3 = entrada.nextFloat();
		System.out.print("Nota 4 :");
		float n4 = entrada.nextFloat();
		
		float media = (n1+n2+n3+n4)/4;
				
		
		System.out.println(name + ", sua média foi " + media);
		
		
	}

}
