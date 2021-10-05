package atvs;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int numAlunos = 5;
		double[] notasAlunos = new double[numAlunos];
		
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Insira a nota do " +(i+1)+"° aluno: ");
			notasAlunos[i] = entrada.nextDouble();
		}
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Notas -> "+ (i+1) + "° " + notasAlunos[i]);
		}
		
	}

}
