package atvs;

import java.util.Scanner;

public class Opera��es {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float A, B;
		float soma, divisao, subtracao, multiplicacao;
		
		System.out.print("Digite o Primeiro valor: ");
		A = entrada.nextInt();
		System.out.print("Digite o Segundo valor: ");
		B = entrada.nextInt();
		soma = A + B;
		divisao = A / B;
		subtracao = A - B;
		multiplicacao = A * B;
		
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("A subtracao dos valores �: " + subtracao);
		System.out.println("A divisao dos valores �: " + divisao);
		System.out.println("A multiplicacao dos valores �: " + multiplicacao);

	}

}
