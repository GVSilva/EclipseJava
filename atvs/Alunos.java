package atvs;

import java.util.Scanner;

public class Alunos {
	public static void main(String[] Args) {

		final int Total_Alunos = 4;
		final int Total_bim = 4;
		final double Nota_min = 70.0;

		Scanner entrada = new Scanner(System.in);
		String[] nomeAlunos = new String[Total_Alunos];
		double[][] notaAlunos = new double[Total_Alunos][Total_bim];
		double[] mediaAlunos = new double[Total_Alunos];

		// Obter nome dos Alunos.

		for (int i = 0; i < Total_Alunos; i++) {
			System.out.println("Informe o nome do " + (i + 1) + "° aluno:");
			nomeAlunos[i] = entrada.nextLine();

		}
		System.out.println("");

		// Obter nota dos alunos em todos os bimestres.

		for (int i = 0; i < Total_Alunos; i++) {
			for (int j = 0; j < Total_bim; j++) {
				System.out.println("Informe a nota do " + nomeAlunos[i] + " para o " + (j + 1) + "°  bimestre");
				notaAlunos[i][j] = entrada.nextDouble();

			}
		}

		// Calcular a média dos alunos.
		for (int i = 0; i < Total_Alunos; i++) {
			for (int j = 0; j < Total_bim; j++) {
				mediaAlunos[i] = +notaAlunos[i][j];
			}
			mediaAlunos[i] /= Total_bim;
		}

		// Mostrar a situação dos alunos.

		System.out.println("========= RESULTADO FINAL =========");

		for (int i = 0; i < Total_Alunos; i++) {
			if (mediaAlunos[i] >= Nota_min) {
				System.out.println("Nome: " + nomeAlunos[i] + " Media: " + mediaAlunos[i] + " Situação: Aprovado");
				continue;
			}
			System.out.println("Nome: " + nomeAlunos[i] + " Media: " + mediaAlunos[i] + " Situação: Reprovado");
		}
	}
}
