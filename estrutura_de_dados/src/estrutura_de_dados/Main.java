package estrutura_de_dados;

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

	}

}