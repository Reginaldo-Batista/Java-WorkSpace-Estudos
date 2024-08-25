package estrutura_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Bloco inicio = new Bloco();

		menu(inicio);

	}

	public static void menu(Bloco inicio) {

		Scanner sc = new Scanner(System.in);
		boolean loopMenu = true;
		int escolha = 0;
		int novoValor = 0;
		int indice = 0;

		do {

			System.out.println("Número de blocos: " + inicio.getValor());
			inicio.imprimeBlocos();
			System.out.println();

			System.out.println("[1] Inserir no início");
			System.out.println("[2] Inserir no final");
			System.out.println("[3] Inserir em um determinado índice");
			System.out.println("[4] Sair");
			System.out.println("Sua escolha: ");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o novo valor: ");
				inicio.addBlocoInicio(sc.nextInt());
				break;
			case 2:
				System.out.println("Digite o novo valor: ");
				inicio.addBlocoFim(sc.nextInt());
				break;
			case 3:
				System.out.println("Digite o novo valor: ");
				novoValor = sc.nextInt();
				System.out.println("Digite o índice: ");
				indice = sc.nextInt();
				inicio.addBloco(novoValor, indice);
				break;
			case 4:
				System.out.println("Saindo...");
				loopMenu = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (loopMenu);

		sc.close();
	}

}