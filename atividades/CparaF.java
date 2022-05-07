package atividades;

import java.util.Scanner;

public class CparaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" CELSIUS PARA FAHRENHEIT ");
		System.out.println("Informe a temperatura em Celsius: ");
		double C = entrada.nextDouble();
		
		double F = (C * 9/5) + 32;
	
		System.out.println("A temperatura em Fahrenheit é: "+ F);
	}

}
