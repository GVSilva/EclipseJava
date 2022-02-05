package projetos;

import java.util.Scanner;
//Crie um programa exiba o maior valor informado pelo usuário. O usuário deverá informar 4 valores.
public class MaiorNumero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int nm1,nm2,nm3,nm4,maiorNm = 0;
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Verificar o maior número");
		System.out.println("Digite um valor: ");
		nm1 = entrada.nextInt();
		 maiorNm = nm1;
		 
		System.out.println("Digite mais um valor: ");
		nm2 = entrada.nextInt();
		if (nm2 > maiorNm) {
			maiorNm = nm2;
		}
		System.out.println("Digite mais um valor: ");
		nm3 = entrada.nextInt();
		if (nm3 > maiorNm) {
			maiorNm = nm3;
		}

		System.out.println("Digite mais um valor: ");
		nm4 = entrada.nextInt();
		if (nm4 > maiorNm) {
			maiorNm = nm4;
		}
		
		System.out.println("O maior número digitado foi: "+maiorNm);
	
	}

}
