package atividades;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu login? (Não conter espaço) ");
		String login = entrada.next();

		System.out.println("Qual a sua senha? (Não conter espaço) ");
		String senha = entrada.next();

		if (login.equals("usuario") && senha.equals("123456789")) {
			System.out.println("Logado com sucesso.");
		} else {
			System.out.println("Login ou senha invalidos.");
		}
	}
}
