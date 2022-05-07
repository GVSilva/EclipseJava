package atividades;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor ganho por hora trabalhada: ");
		double ValorpHora = entrada.nextDouble();
		System.out.println("Quantas horas trabalhou no mês: ");
		int horas = entrada.nextInt();
		
		double total = ValorpHora * horas;
		
		System.out.println("O salário será : "+ total);
		

	}

}
