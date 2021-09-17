package atvs;

import java.util.Scanner;

public class Operações {

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
		
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A subtracao dos valores é: " + subtracao);
		System.out.println("A divisao dos valores é: " + divisao);
		System.out.println("A multiplicacao dos valores é: " + multiplicacao);

	}

}
