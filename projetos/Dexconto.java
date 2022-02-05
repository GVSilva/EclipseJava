package projetos;

import java.util.Scanner;

public class Dexconto {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner entrada = new Scanner(System.in);
			
			double valorProd, desconto, precoDesconto = 0;
			String nmProd = "";
			
			System.out.println("Loja do Dexcontinho $$");

			System.out.print("Informe o nome do produto: ");
			nmProd = entrada.nextLine();

			System.out.print("Qual o valor deste produto? ");
			valorProd = Double.parseDouble(entrada.nextLine());
			
			precoDesconto = valorProd;

			if ((valorProd > 100) && (valorProd <= 200)) {
				 desconto = (valorProd * 0.10);

				System.out.println("O Valor do " + nmProd + " ficou em R$ " + (valorProd - desconto));

			} if ((valorProd > 200) && (valorProd <= 300)) {
				 desconto = (valorProd * 0.20);

				System.out.println("O Valor do " + nmProd + " ficou em R$ " + (valorProd - desconto));

			} if (valorProd > 300){
				desconto = valorProd * 0.30;

				System.out.println("O Valor do " + nmProd + " ficou em R$ " + (valorProd - desconto));
			}
					
		}
	}