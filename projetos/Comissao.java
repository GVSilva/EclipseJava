/*   3) Fa�a um programa para pagamento de comiss�o de vendedores de pe�as,
	 *		levando-se em considera��o que sua comiss�o ser� de 5% do total da venda 
	 *		e que voc� tem os seguintes dados:	 
	 * 		- Identifica��o do vendedor
	 * 		- C�digo da pe�a	 		
	 * 		- Pre�o unit�rio da pe�a
	 * 		- Quantidade vendida */

package projetos;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int matricula, qtVenda, IDpeca = 0;
		double valorPeca, comissao = 0;
		
		System.out.println(" COMISS�ES ");
		
		System.out.print("Insira a matr�cula do colaborador(a) : ");
		matricula = entrada.nextInt();
		
		System.out.print("ID da pe�a: ");
		IDpeca = entrada.nextInt();
		
		System.out.print("Qual o valor unit�rio da pe�a? ");
		valorPeca = entrada.nextDouble();
		
		System.out.print("Informe a quantidade vendida :");
		qtVenda = entrada.nextInt();
		
		comissao = (qtVenda * valorPeca) * 0.05f;
		
		
		System.out.printf("Comiss�o do colaborador " + matricula + " R$ %.2f ", comissao );
		
		
		
		
		
	}

}
