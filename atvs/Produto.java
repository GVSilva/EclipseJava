package atvs;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double preco, preco_vista, preco_desconto;
		
		System.out.print("Digite o Valor bruto do produto: ");
		preco = entrada.nextDouble();
		
		preco_desconto = (preco/100) * 10;
		preco_vista = preco - preco_desconto;
		
		System.out.println(" O preço bruto do produto é: " + preco
				+ "\n o desconto foi de: " + preco_desconto
				+ "\n o valor a vista vai ser de: " + preco_vista);
		
		
	}

}
