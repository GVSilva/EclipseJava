package projetos;

import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("**** Compra de Produtos ****");
		
		System.out.print("Qual é o seu nome: ");
		String nm = entradaDados.nextLine();
		
		System.out.print(nm+", quanto dinheiro possui? ");
		double dindin = entradaDados.nextDouble();
		
		System.out.print("Qual e o produto? ");
		String nmProd = entradaDados.next();
		
		System.out.print("Qual o valor do "+ nmProd+"? ");
		double dinprod = entradaDados.nextDouble();
		
		System.out.print("Informe a quantidade do produto "+nmProd+" que quer comprar: ");
		int quant = entradaDados.nextInt();
		
		 double totalvenda = dinprod * quant;
		 if (dindin >= totalvenda) {
		 System.out.println(nm+", sua compra ficou em R$ "+totalvenda+" \n você pagou este valor e sobrou R$" +(dindin-totalvenda));
			
		 }else { System.out.println(nm+ ", você não tem dinheiro para efetuar a compra.");	
	}
  }
}