package projetos;

import java.util.Scanner;

public class EstoqueMedio {
 //Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
 //	 *  ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double maxEstq, minEstq, mediaEstq = 0;
		System.out.println("Qual o estoque m�ximo? ");
		maxEstq = entrada.nextDouble();
	
		System.out.println("Qual o estoque m�nimo? ");
		minEstq = entrada.nextDouble();
		
		mediaEstq = (maxEstq + minEstq )/2;
		
		System.out.println("O estoque m�dio do produto �: "+mediaEstq);
	}

}
