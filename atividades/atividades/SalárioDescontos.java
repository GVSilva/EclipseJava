package atividades;

import java.util.Scanner;

public class Sal�rioDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double IRR = 0.8, inss = 0.11, sindicato = 0.5;
		
		System.out.print("Informe o valor por hora trabalhada: ");
		int Valorphora = entrada.nextInt();
		System.out.print("Informe quantas horas foram feitas no m�s: ");
		double Horatrab = entrada.nextDouble();
		
		double SalBruto = Valorphora * Horatrab;
		
		double valorposINSS = SalBruto * inss;
		
		double valorposIRR = valorposINSS * IRR;
		
		double valorposSind = valorposIRR * sindicato;
		
		double descontos = valorposINSS + valorposIRR + valorposSind; 
		
		double SalL�quido = SalBruto - descontos;
		
		System.out.println("Sal�rio bruto: R$ "+SalBruto);
		System.out.println("Valor dos descontos: \n - INSS = " + valorposINSS);
		System.out.println("Valor dos descontos: \n - IRR = " + valorposIRR);
		System.out.println("Valor dos descontos: \n - Sindicato = " + valorposSind);
		
		System.out.println("O Sal�rio l�quido e de : R$" + SalL�quido);
			
	}

}
