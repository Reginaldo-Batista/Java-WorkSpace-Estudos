package classes_antonio;

public class Pilha {

	Lista lista = new Lista();

	public void push(int valor) {
		this.lista.addElemento(valor, false);
	}

	public Bloco pop() {
		return this.lista.removerElementoFim();
	}

	public Bloco topo() {
		int tamanho = this.lista.tamanho();
		Bloco topo = this.lista.localizarBloco(tamanho);
		return topo;
	}

	public void printPilha() {
		this.lista.printLista();
	}
}
