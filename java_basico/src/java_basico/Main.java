package java_basico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Iniciando da melhor forma
		System.out.println("Olá, mundo!");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i + 1);
		}
		System.out.println();

		System.out.println("Insira um número inteiro: ");
		int x = sc.nextInt();
		System.out.println("Você digitou: " + x);

		String mensagem = (x >= 0) ? "é positivo" : "é negativo";
		System.out.println(x + " " + mensagem);

		sc.nextLine();
		String nome = sc.nextLine();

		System.out.println("Seu nome é: " + nome);

		sc.close();

		System.out.println("Fim do programa!");

	}

}
