package atividades;

import java.util.Scanner;

public class Metros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println(" CENTÍMETROS PARA METROS ");
		System.out.println(" Quantidade em Centímetros: ");
		double cm = input.nextDouble();
		
		double metros = cm/100;
		
		System.out.println("Os metros são: " +metros);
	
	}	

}
