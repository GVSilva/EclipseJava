package atvs;

import java.util.Scanner;

public class Calculadora {

	public static void main(String []Args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, soma, subtracao, multi, divi;
		
		System.out.println("Insira um n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Insira um outro n�mero: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: "+ soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtrac�o �: "+ subtracao);
		
		multi = num1 * num2;
		System.out.println("O resultado da multiplica��o �: "+ multi);
		
		divi = num1 / num2;
		System.out.println("O resultado da divis�o �: "+ divi);
		
				
	}
	
}

