package estrutura_de_dados;

public class Lista {

	private int numeroDeBlocos;
	private Bloco inicio;

	public Bloco localizaBloco(int indice) {

		Bloco aux = this.inicio;
		int contador = 0;

		while (aux != null && contador < indice) {
			aux = aux.getProximo();
			contador++;
		}
		if (aux != null && indice >= 0) {
			return aux;
		}
		return null;

	}

	public void addBloco(int valor) {

		Bloco novoBloco = new Bloco(valor, this.inicio);
		this.inicio = novoBloco;
		this.numeroDeBlocos++;

	}

	public void addBloco(int valor, int indice) {

		if (indice == 0 || this.inicio == null) {
			this.addBloco(valor);
			return;
		}

		Bloco aux = localizaBloco(indice - 1);

		if (aux != null) {
			Bloco novoBloco = new Bloco(valor, aux.getProximo());
			aux.setProximo(novoBloco);
			this.numeroDeBlocos++;
		}

	}

	public void removeBloco() {

		if (this.inicio != null) {
			Bloco primeiroBloco = this.inicio;
			this.inicio = primeiroBloco.getProximo();
			this.numeroDeBlocos--;
		}

	}

	public void removeBloco(int indice) {
		
		if (indice == 0) {
			this.removeBloco();
			return;
		}
		
		Bloco blocoAnterior = this.localizaBloco(indice - 1);
		
		if(blocoAnterior != null && blocoAnterior.getProximo() != null) {
			Bloco blocoEscolhido = blocoAnterior.getProximo();
			blocoAnterior.setProximo(blocoEscolhido.getProximo());
			this.numeroDeBlocos--;
		}
		
	}

	public void printLista() {

		Bloco aux = this.inicio;

		if (aux == null) {
			System.out.println("Lista vazia!");
			return;
		}

		System.out.printf("Existem %d blocos nesta lista:\n", this.numeroDeBlocos);
		while (aux != null) {
			System.out.printf(aux.getValor() + " -> ");
			aux = aux.getProximo();
		}
		System.out.println("null");

	}

	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}

}
