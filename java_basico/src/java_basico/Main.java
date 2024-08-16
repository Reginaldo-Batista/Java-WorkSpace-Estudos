package java_basico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Iniciando da melhor forma
		System.out.println("Olá, mundo!");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i + 1);
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro: ");
		int x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		String mensagem = (x >= 0) ? "é positivo" : "é negativo";
		System.out.println(21 + " " + mensagem);
		
		sc.close();
	}

}
