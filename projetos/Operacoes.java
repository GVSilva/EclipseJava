package projetos;

import java.util.Scanner;

public class Operacoes {
	
	public static void main(String[] Args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float n1 = entrada.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float n2 = entrada.nextFloat();
		
		float soma = n1 + n2;
		float subtr = n1 - n2;
		float mult = n1 * n2;
		float div = n1 / n2;
		
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Subtração dos valores: " + subtr);
		System.out.println("Multiplicação dos valores: " + mult);
		System.out.println("Divisão dos valores: " + div);
				
		
	}

}
