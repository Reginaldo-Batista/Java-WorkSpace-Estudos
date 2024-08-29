package rascunhos_e_testes;

import classes.Administrador;
import classes.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getEndereço());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getNome());

		System.out.println();

		Administrador admin = new Administrador();
		System.out.println(admin.getCpf());
		System.out.println(admin.getEndereço());
		System.out.println(admin.getIdade());
		System.out.println(admin.getNome());
		System.out.println(admin.getNumeroContrato());

	}

}
