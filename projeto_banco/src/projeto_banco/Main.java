package projeto_banco;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		String nomeDoBanco = "Banco Nacional";
		Pessoa pessoa = new Pessoa();

		System.out.printf("Bem-vindo ao %s\n", nomeDoBanco);

		cadastrarPessoa(pessoa);
		System.out.println(pessoa.toString());

	}

	public static void cadastrarPessoa(Pessoa pessoa) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu nome completo: ");
		pessoa.setNome(sc.nextLine());

		System.out.println("Insira seu CPF (apenas números): ");
		pessoa.setCpf(sc.nextLine());

		System.out.println("Insira seu número para contato (apenas números): ");
		pessoa.setContato(sc.nextLine());

		sc.close();

	}

}
