package classes_antonio;

public class ListaDupla {

	BlocoDuplo inicio;

	public BlocoDuplo addElemento(int valor, boolean posicaoIncio) {

		BlocoDuplo novo = null;

		if (posicaoIncio == true) {

			novo = this.addElementoInicio(valor);

		} else {

			novo = this.addElementoFim(valor);
		}

		return novo;
	}

	private BlocoDuplo addElementoInicio(int valor) {

		BlocoDuplo antigoBloco = this.inicio;

		BlocoDuplo novoBloco = new BlocoDuplo();
		novoBloco.valor = valor;

		if (antigoBloco != null) {
			antigoBloco.anterior = novoBloco;
		}

		novoBloco.prox = antigoBloco;
		this.inicio = novoBloco;

		return novoBloco;
	}

	private BlocoDuplo addElementoFim(int valor) {

		BlocoDuplo novo = null;

		BlocoDuplo fim = this.localizarBloco(this.tamanho());

		if (fim == null) {
			// Se a lista estiver vazia:
			novo = this.addElementoInicio(valor);
		} else {

			novo = new BlocoDuplo();
			novo.valor = valor;
			novo.anterior = fim;
			fim.prox = novo;

		}

		return novo;
	}

	public BlocoDuplo localizarBloco(int pos) {

		BlocoDuplo aux = this.inicio;
		int cont = 0;

		while (aux != null && cont < pos - 1) {
			cont++;
			aux = aux.prox;
		}
		return aux;
	}

	public int tamanho() {

		BlocoDuplo aux = this.inicio;
		int cont = 0;

		while (aux != null) {

			cont++;
			aux = aux.prox;
		}

		return cont;
	}

	public void printLista() {
		
		BlocoDuplo aux = this.inicio;
		
		if (aux == null) {
			System.out.println("Vazia!");
			return;
		}
		
		System.out.printf("Existem %d bloco(s):\n", this.tamanho());
		while (aux != null) {
			System.out.printf(aux.valor + " <-> ");
			aux = aux.prox;
		}
		System.out.println("null");
	}
	
	public void printListaInvertida() {

		BlocoDuplo aux = this.localizarBloco(this.tamanho());

		if (aux == null) {
			System.out.println("Vazia!");
			return;
		}

		System.out.printf("Existem %d bloco(s):\n", this.tamanho());
		while (aux != null) {
			System.out.printf(aux.valor + " <-> ");
			aux = aux.anterior;
		}
		System.out.println("null");
	}
	
}
