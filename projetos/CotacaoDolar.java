package projetos;

import java.util.Scanner;

public class CotacaoDolar {
/* 		2) 		Fa�a um programa que:
	 *    - Leia a cota��o do d�lar
	 *    - Leia um valor em d�lares
	 *    - Converta esse valor para Real
	 *    - Mostre o resultado*/ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dolar, real, cotacao =0; 
		Scanner valores = new Scanner(System.in);
		
		System.out.println(" CONVERSOR DE DOLAR PARA REAL ");
		
		System.out.println("Valor d�lar : ");
		cotacao = valores.nextDouble();
		
		System.out.println("Digite o valor em d�lar : ");
		dolar = valores.nextDouble();
		
		real = cotacao * dolar;
		
		System.out.println("O valor em reais �: " + real);
	}

}
