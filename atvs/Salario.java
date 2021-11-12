package atvs;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double HT, VH, PD, SB, TD, SL;

		System.out.println("Horas trabalhadas no mês : ");
		HT = entrada.nextDouble();

		System.out.println("Valor da hora:  ");
		VH = entrada.nextDouble();

		System.out.println("Percentual de desconto");
		PD = entrada.nextDouble();

		SB = HT * VH;
		TD = (PD / 100) * SB;
		SL = SB - TD;

		System.out.println("O Salário Bruto é: " + SB + " .\n O Salário Líquido foi de: " + SL
				+ " .\n E o Desconto foi de : " + TD);
	}

}
