package atvs;

import java.util.Scanner;

public class Gabarito {

	public static void main(String[] Args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("-----  Gabarito  -----");
		System.out.println("Responda de 1 a 5 ");
		System.out.println("                  ");
		

		System.out.print("Resposta quest�o 1: ");
		int Quest1 = entrada.nextInt();
		System.out.print("Resposta quest�o 2: ");
		int Quest2 = entrada.nextInt();
		System.out.print("Resposta quest�o 3: ");
		int Quest3 = entrada.nextInt();
		System.out.print("Resposta quest�o 4: ");
		int Quest4 = entrada.nextInt();
		System.out.print("Resposta quest�o 5: ");
		int Quest5 = entrada.nextInt();
		System.out.print("Resposta quest�o 6: ");
		int Quest6 = entrada.nextInt();
		System.out.print("Resposta quest�o 7: ");
		int Quest7 = entrada.nextInt();
		System.out.print("Resposta quest�o 8: ");
		int Quest8 = entrada.nextInt();
		System.out.print("Resposta quest�o 9: ");
		int Quest9 = entrada.nextInt();
		System.out.print("Resposta quest�o 10: ");
		int Quest10 = entrada.nextInt();
		System.out.println("              ");

		System.out.println("Digite o nome do aluno: ");
		String aluno = entrada.next();

		System.out.println("Gabarito Aluno: "+ aluno);
		System.out.print("Respostas quest�o 1: ");
		int QuestAlun1 = entrada.nextInt();
		System.out.print("Respostas quest�o 2: ");
		int QuestAlun2 = entrada.nextInt();
		System.out.print("Respostas quest�o 3: ");
		int QuestAlun3 = entrada.nextInt();
		System.out.print("Respostas quest�o 4: ");
		int QuestAlun4 = entrada.nextInt();
		System.out.print("Respostas quest�o 5: ");
		int QuestAlun5 = entrada.nextInt();
		System.out.print("Respostas quest�o 6: ");
		int QuestAlun6 = entrada.nextInt();
		System.out.print("Respostas quest�o 7: ");
		int QuestAlun7 = entrada.nextInt();
		System.out.print("Respostas quest�o 8: ");
		int QuestAlun8 = entrada.nextInt();
		System.out.print("Respostas quest�o 9: ");
		int QuestAlun9 = entrada.nextInt();
		System.out.print("Respostas quest�o 10: ");
		int QuestAlun10 = entrada.nextInt();
		
		System.out.println(" ------------------------------- ");
		System.out.println("Corre��o : \n");

		int ponto = 0;

		if (QuestAlun1 == Quest1) {
			System.out.println("Resposta quest�o 1: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun1 != Quest1) {
			System.out.println("Resposta quest�o 1: Errada ");
		}
		if (QuestAlun2 == Quest2) {
			System.out.println("Resposta quest�o 2: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun2 != Quest2) {
			System.out.println("Resposta quest�o 2: Errada ");
		}
		if (QuestAlun3 == Quest3) {
			System.out.println("Resposta quest�o 3: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun3 != Quest3) {
			System.out.println("Resposta quest�o 3: Errada ");
		}
		if (QuestAlun4 == Quest4) {
			System.out.println("Resposta quest�o 4: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun4 != Quest4) {
			System.out.println("Resposta quest�o 4: Errada ");
		}
		if (QuestAlun5 == Quest5) {
			System.out.println("Resposta quest�o 5: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun5 != Quest5) {
			System.out.println("Resposta quest�o 5: Errada ");
		}
		if (QuestAlun6 == Quest6) {
			System.out.println("Resposta quest�o 6: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun6 != Quest6) {
			System.out.println("Resposta quest�o 6: Errada ");
		}
		if (QuestAlun7 == Quest7) {
			System.out.println("Resposta quest�o 7: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun7 != Quest7) {
			System.out.println("Resposta quest�o 7: Errada ");
		}
		if (QuestAlun8 == Quest8) {
			System.out.println("Resposta quest�o 8: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun8 != Quest8) {
			System.out.println("Resposta quest�o 8: Errada ");
		}
		if (QuestAlun9 == Quest9) {
			System.out.println("Resposta quest�o 9: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun9 != Quest9) {
			System.out.println("Resposta quest�o 9: Errada ");
		}
		if (QuestAlun10 == Quest10) {
			System.out.println("Resposta quest�o 7: Certa ");
			ponto = ponto+ 1;
		} else if (QuestAlun10 != Quest10) {
			System.out.println("Resposta quest�o 7: Errada ");
		}
		
		System.out.println("Nota do aluno "+ aluno + ": " + ponto);
	}
}
