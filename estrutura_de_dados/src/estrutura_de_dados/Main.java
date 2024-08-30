package estrutura_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBlocoInicio(i);
		}
		lista.printLista();
		System.out.println();
		
		// Estudo com pilha
		Pilha pilha = new Pilha();
		for (int i = 0; i < 3; i++) {
			pilha.addBloco(i);
		}
		pilha.printPilha();

	}

}