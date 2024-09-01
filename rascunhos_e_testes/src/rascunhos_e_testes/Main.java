package rascunhos_e_testes;

import classes.Pessoa;

public class Main {

	public static void main(String[] args) {
		final int qnt = 3;
		Pessoa[] pessoas = new Pessoa[qnt];

		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa("nome", 12, "123", "rua");
			System.out.println(pessoas[i].toString());
		}
	}

}
