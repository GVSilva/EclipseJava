package atvs;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int TG, VM, distancia, litros_usados;
		System.out.print("Tempo de viagem gasto: ");
		TG = entrada.nextInt();
		System.out.print("Qual foi a velocidade média: ");
		VM = entrada.nextInt();

		distancia = TG * VM;
		litros_usados = distancia/12;

		System.out.println("A viagem foi feita em velocidade média de " + VM + "km/h ");
		System.out.println("O tempo gasto de " + TG + " hr.");
		System.out.println("A distancia percorrida foi de " + distancia +" km");
		System.out.println("Foram utilizados " + litros_usados + "L de combustivel."); 
	}
}
