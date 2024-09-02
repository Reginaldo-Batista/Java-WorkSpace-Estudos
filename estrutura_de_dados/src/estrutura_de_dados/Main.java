package estrutura_de_dados;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();

		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBlocoInicio(i);
		}
		lista.printLista();

		System.out.println();

		// Estudo com pilha
		Pilha pilha = new Pilha();
		for (int i = 0; i < 2; i++) {
			pilha.addBloco(i);
		}
		pilha.printPilha();

		System.out.println();

		// Estudo com fila
		Fila fila = new Fila();
		for (int i = 0; i < 5; i++) {
			fila.addBloco(i);
		}
		fila.printFila();

		System.out.println();

		// Estudo com árvore binária
		ArvoreBinaria arvBinaria = new ArvoreBinaria();

		for (int i = 0; i < 10; i++) {
			arvBinaria.adicionaNo(random.nextInt(10));
		}
		
		System.out.printf("Pré-ordem: ");
		arvBinaria.printPreOrder(arvBinaria.getRaiz());
		
		System.out.println();
		
		System.out.printf("Simetrico: ");
		arvBinaria.printInOrder(arvBinaria.getRaiz());

		System.out.println();
		
		System.out.printf("Pós-ordem: ");
		arvBinaria.printPosOrder(arvBinaria.getRaiz());

	}

}