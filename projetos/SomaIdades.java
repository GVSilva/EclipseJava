package projetos;

import java.util.Scanner;

//Elabore um algoritmo que some a idade de 5 pessoas.
public class SomaIdades {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, idades, total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Somar idades");
		
		for (i = 0; i < 5; i++) {
			System.out.print("Informe a idade da "+(i+1)+"° pessoa:");
			 idades = entrada.nextInt();
			
			total = total + idades; 
		}
		
		System.out.println("A soma das idades é de: "+total);
	}

}
