package atividades;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("VERIFICADOR DE NOTAS");
		System.out.println("Digite a 1° nota do aluno");
		int n1 = entrada.nextInt();
		System.out.println("Digite a 2° nota do aluno");
		int n2 = entrada.nextInt();
		System.out.println("Digite a 3° nota do aluno");
		int n3 = entrada.nextInt();
		System.out.println("Digite a 4° nota do aluno");
		int n4 = entrada.nextInt();
		
		double média = (n1+n2+n3+n4)/4; 

		System.out.println("A média do aluno é: "+ média);
	
	}

}
