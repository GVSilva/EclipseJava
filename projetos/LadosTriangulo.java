package projetos;

import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int la, lb, lc = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor de cada lado: ");
		System.out.println("LADO A: ");
		la = entrada.nextInt();
		System.out.println("LADO B: ");
		lb = entrada.nextInt();
		System.out.println("LADO C: ");
		lc = entrada.nextInt();
		
		if ((la < (lb + lc)) && (lb < (la + lc)) && (lc < (lb+la))){
			System.out.println(" Os valores inseridos, formam um triângulo.");
		} else {
			System.out.println(" Não é possível criar um triângulo");
		}
		
	}
	

}
