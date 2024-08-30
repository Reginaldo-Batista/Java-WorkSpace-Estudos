package estrutura_de_dados;

public class Lista {

	private int numeroDeBlocos;
	private Bloco inicio;

	public Lista() {
		this.numeroDeBlocos = 0;
		this.inicio = null;
	}

	public Bloco localizaBloco(int indice) {

		Bloco aux = this.inicio;
		int contador = 0;

		while (aux != null && contador < indice - 1) {
			aux = aux.getProximo();
			contador++;
		}
		if (aux != null) {
			return aux;
		}
		return null;

	}

	public void addBlocoInicio(int valor) {

		Bloco novoBloco = new Bloco(valor, this.inicio);
		inicio = novoBloco;
		this.numeroDeBlocos++;

	}

	public void addBloco(int valor, int indice) {

		if (indice <= 0 || indice >= this.numeroDeBlocos) {
			return;
		}

		Bloco aux = localizaBloco(indice);

		if (aux != null) {
			Bloco novoBloco = new Bloco(valor, aux.getProximo());
			aux.setProximo(novoBloco);
			this.numeroDeBlocos++;
			return;
		}

		if (this.inicio == null) {
			this.addBlocoInicio(valor);
			return;
		}

	}

	public void addBlocoFim(int valor) {

		if (this.inicio == null) {
			this.addBlocoInicio(valor);
			return;
		}

		Bloco aux = this.inicio;

		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		Bloco novoBloco = new Bloco(valor, aux.getProximo());
		aux.setProximo(novoBloco);
		this.numeroDeBlocos++;
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

	public void setNumeroDeBlocos(int numeroDeBlocos) {
		this.numeroDeBlocos = numeroDeBlocos;
	}

}
