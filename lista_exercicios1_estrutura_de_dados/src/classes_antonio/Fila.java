package classes_antonio;

public class Fila {

	Lista lista = new Lista();

	public void push(int valor) {
		this.lista.addElemento(valor, false);
	}

	public Bloco pop() {
		return this.lista.removerElementoInicio();
	}

	public void printFila() {
		this.lista.printLista();
	}

	public Pilha pilhaEquivalente() {
		Bloco aux = this.lista.inicio;
		Pilha pilha = new Pilha();
		while (aux != null) {
			pilha.push(aux.valor);
			aux = aux.prox;
		}
		return pilha;
	}

}
