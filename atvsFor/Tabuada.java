package atvsFor;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, resul;
		
		System.out.print("Digite um n�mero de 1 � 10, para obter a tabuada:");
		num = entrada.nextInt();
		
		if(num>= 1 && num <=10) {
			
		for (int i = 0; i < 11; i++) {
			resul = num * i;
			System.out.println(num +" X " + i + " = " + resul);
			}
		} else {
			System.out.println("Digite um n�mero entre 1 e 10.");
		}
	}
}