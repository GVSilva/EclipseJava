/*   3) Faça um programa para pagamento de comissão de vendedores de peças,
	 *		levando-se em consideração que sua comissão será de 5% do total da venda 
	 *		e que você tem os seguintes dados:	 
	 * 		- Identificação do vendedor
	 * 		- Código da peça	 		
	 * 		- Preço unitário da peça
	 * 		- Quantidade vendida */

package projetos;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int matricula, qtVenda, IDpeca = 0;
		double valorPeca, comissao = 0;
		
		System.out.println(" COMISSÕES ");
		
		System.out.print("Insira a matrícula do colaborador(a) : ");
		matricula = entrada.nextInt();
		
		System.out.print("ID da peça: ");
		IDpeca = entrada.nextInt();
		
		System.out.print("Qual o valor unitário da peça? ");
		valorPeca = entrada.nextDouble();
		
		System.out.print("Informe a quantidade vendida :");
		qtVenda = entrada.nextInt();
		
		comissao = (qtVenda * valorPeca) * 0.05f;
		
		
		System.out.printf("Comissão do colaborador " + matricula + " R$ %.2f ", comissao );
		
		
		
		
		
	}

}
