package projetos;

import java.util.Scanner;

public class EstoqueMedio {
 //Faça um programa para calcular o estoque médio de uma peça, sendo que:
 //	 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double maxEstq, minEstq, mediaEstq = 0;
		System.out.println("Qual o estoque máximo? ");
		maxEstq = entrada.nextDouble();
	
		System.out.println("Qual o estoque mínimo? ");
		minEstq = entrada.nextDouble();
		
		mediaEstq = (maxEstq + minEstq )/2;
		
		System.out.println("O estoque médio do produto é: "+mediaEstq);
	}

}
