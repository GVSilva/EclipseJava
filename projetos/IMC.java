package projetos;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Peso em KG: ");
		double kg = entrada.nextDouble();
		
		System.out.println("Altura: (ex:1,70) ");
		double altura = entrada.nextDouble();
		
		double IMC = kg /(altura * altura);
		
		System.out.println("O IMC é: " + IMC);
		
	}

}
