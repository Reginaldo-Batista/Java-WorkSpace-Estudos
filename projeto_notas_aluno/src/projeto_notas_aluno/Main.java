package projeto_notas_aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Testando!
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		boolean loopMenu = true;

		do {

			System.out.println("[1] Qual o minimo devo tirar na segunda nota?");
			System.out.println("[2] Quanto preciso na terceira nota?");
			System.out.println("[3] Qual minha nota final?");
			System.out.println("[4] Para sair do programa");
			System.out.println("Sua escolha: ");
			int escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Nota 1ª prova: ");
				aluno.setNota1(sc.nextFloat());
				System.out.println("Precisará tirar pelo menos: " + aluno.calcMinimoNecessarioSegundaProva());
				break;

			case 2:
				System.out.println("Nota 1ª prova: ");
				aluno.setNota1(sc.nextFloat());
				System.out.println("Nota 2ª prova: ");
				aluno.setNota2(sc.nextFloat());
				System.out.println("Precisará tirar na teceira: " + aluno.calcNecessarioTerceiraProva());
				break;

			case 3:
				System.out.println("Nota 1ª prova: ");
				aluno.setNota1(sc.nextFloat());
				System.out.println("Nota 2ª prova: ");
				aluno.setNota2(sc.nextFloat());
				System.out.println("Nota 3ª prova: ");
				aluno.setNota3(sc.nextFloat());
				System.out.println("Sua média final é: " + aluno.calcNotaFinal());

				break;

			case 4:
				System.out.println("Programa encerrado!");
				loopMenu = false;

				break;

			default:
				System.out.println("Comando inválido!");

			}

		} while (loopMenu);

		sc.close();
	}

}
