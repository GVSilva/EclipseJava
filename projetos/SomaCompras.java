package projetos;

import java.util.Scanner;

public class SomaCompras {

	public static void main (String []Args) {
		//Fa�a um algoritmo que some o total de uma conta. O usu�rio dever� informar a quantidade de produtos que ser�o informados.
		
		Scanner dados = new Scanner(System.in);
		int prod, i = 0;
		double valor, soma = 0;
		
		System.out.println(" *****  CAIXA  ***** ");
		
		System.out.print("Quantos produtos ir� passar? ");
		prod = dados.nextInt();
		
		while (i < prod) {
			System.out.print("Digite o valor do "+ ++i +"� produto: ");
			valor = dados.nextDouble();
			soma = soma + valor;			
		}
		
		System.out.println("A compra fechou em R$ " +soma);
		
	}
}
