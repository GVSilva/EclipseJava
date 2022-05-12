package atividades;

import java.util.Scanner;

public class FparaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.println("FAHRENHEIT PARA CELSIUS");
		
		System.out.println("Informe a temperatura em FAHRENHEIT: ");
		double F = entrada.nextDouble();
		
		double C = 5 *((F-32)/9);
		
		System.out.println("A temperatura em Celsius é: " + C);
	}	

}
