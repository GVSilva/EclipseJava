package atvs;

import java.util.Scanner;

public class CalculadoraV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int x = 0;
		double num1 = 0, num2 = 0, resultado = 0;
		
		do {

			System.out.println(" 1- para Somar \n 2- para Subtrair "
					+ "\n 3- para Multiplicar \n 4- para Dividir \n 0- para Sair.");
			System.out.print("Digite a opção Desejada: ");
			x = entrada.nextInt();
			System.out.println("");
			

			if (x != 0) {
				
				System.out.print("Digite o primeiro número: ");
				num1 = entrada.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = entrada.nextDouble();

				if (x == 1) {

					resultado = num1 + num2;
					System.out.println("O resultado da Soma é: " + resultado);

				} else if(x == 2) {
					
					resultado = num1 - num2;
					System.out.println("O resultado da Subtração é: " + resultado);
				
				} else if (x == 3) {
					
					resultado = num1 * num2;
					System.out.println("O resultado da Multiplicação é: " + resultado);
				
				} else if (x == 4){
					
					resultado = num1 / num2;
					System.out.println("O resultado da Divisão é: " + resultado);
				}
				System.out.println(" -------------------");
				System.out.println("");
			} 

		} while (x != 0);
		System.out.println("Saindo..");
	} 

}
