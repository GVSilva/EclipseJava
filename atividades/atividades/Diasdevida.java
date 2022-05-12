package atividades;

import java.util.Scanner;

public class Diasdevida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int ano = entrada.nextInt();
		System.out.println("Informe o mês de nascimento: ");
		int mes = entrada.nextInt();
		System.out.println("Informe o dia de nascimento: ");
		int dia = entrada.nextInt();
		
		int totalano = ano * 365;
		int totalmes = mes * 30;
		int idade = totalano + 	totalmes + dia;	
		
		System.out.println("Dias vividos "+ idade);
	}

}
