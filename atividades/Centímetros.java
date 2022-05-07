package atividades;

import java.util.Scanner;

public class Centímetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println(" METROS PARA CENTÍMETROS ");
		System.out.println(" Digite o valor em metros: ");
		int metros = input.nextInt();
		
		
		int cm = metros*100;
		
		System.out.println("Os centímetros são: " + cm);
		
	}

}
