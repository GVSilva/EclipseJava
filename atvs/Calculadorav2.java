package atvs;

import java.util.Scanner;

public class Calculadorav2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println(" ============== CALCULADORA ============");
		System.out.println("Qual a��o deseja realizar?\n 1- SOMAR / 2- SUBTRAIR / 3- MULTIPLICAR / 4-DIVIDIR: ");
		int opcao = entrada.nextInt();
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double num2 = entrada.nextDouble();
		
		if (opcao == 1) {
			System.out.println("Resultado da Soma: " + (num1 + num2));
		} else if (opcao == 2){
			System.out.println("Resultado da Subtra��o: " + (num1 - num2));
		} else if (opcao == 3) {
			System.out.println("Resultado da Multiplica��o: " + (num1 * num2));
		} else if (opcao == 4) {
			System.out.println("Resultado da Divis�o: " + (num1 / num2));
		} else {
			System.out.println("Valor inv�lido!");
		}
		
	}

}
