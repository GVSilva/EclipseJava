package atvs;

import java.util.Scanner;

public class ConversaoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double c, f;

		System.out.println("Digite o Valor em F: ");
		f = entrada.nextDouble();

		c = (f - 32) / 1.8;

		System.out.println(" A temperatura é :" + c);

	}

}
