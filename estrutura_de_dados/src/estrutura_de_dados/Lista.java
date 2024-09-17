package estrutura_de_dados;

public class Lista {

	private Bloco inicio;
	private int numeroDeBlocos;

	public Bloco getInicio() {
		return inicio;
	}

	public void setInicio(Bloco inicio) {
		this.inicio = inicio;
	}

	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}

	public Bloco localizaBloco(int indice) {

		if (indice < 0) {
			return null;
		}

		Bloco aux = this.inicio;
		int contador = 0;

		while (aux != null && contador < indice) {
			aux = aux.getProximo();
			contador++;
		}
		return aux;

	}

	public Bloco localizaBlocoRecursive(int indice) {

		if (indice <= 0) {
			return this.inicio;
		}

		Bloco aux = localizaBlocoRecursive(indice - 1);

		if (aux != null) {
			return aux.getProximo();
		}
		return null;

	}

	public Bloco addBlocoEm(int valor, int indice) {

		if (indice == 0 || this.inicio == null) {
			Bloco novoBloco = new Bloco(valor, this.inicio);
			this.inicio = novoBloco;
			this.numeroDeBlocos++;
			return novoBloco;
		}

		Bloco aux = localizaBloco(indice - 1);

		if (aux != null) {
			Bloco novoBloco = new Bloco(valor, aux.getProximo());
			aux.setProximo(novoBloco);
			this.numeroDeBlocos++;
			return novoBloco;
		}
		return null;

	}

	public Bloco addBlocoEmForcedRecursive(int valor, int indice) {

		if (indice == 0) {
			return this.addBlocoEm(valor, 0);
		}

		Bloco blocoAnterior = this.localizaBloco(indice - 1);
		if (blocoAnterior != null) {
			return this.addBlocoEm(valor, indice);
		}
		this.addBlocoEm(0, this.numeroDeBlocos);
		return this.addBlocoEmForcedRecursive(valor, indice);

	}

	public Bloco removeBlocoEm(int indice) {

		if (this.inicio == null) {
			return null;
		}

		if (indice == 0) {
			Bloco primeiroBloco = this.inicio;
			this.inicio = primeiroBloco.getProximo();
			this.numeroDeBlocos--;
			return primeiroBloco;
		}

		Bloco blocoAnterior = this.localizaBloco(indice - 1);

		if (blocoAnterior != null && blocoAnterior.getProximo() != null) {
			Bloco blocoAlvo = blocoAnterior.getProximo();
			blocoAnterior.setProximo(blocoAlvo.getProximo());
			this.numeroDeBlocos--;
			return blocoAlvo;
		}
		return null;

	}

	public Bloco alteraBlocoEm(int valor, int indice) {

		if (this.inicio == null) {
			return null;
		}

		if (indice == 0) {
			this.inicio.setValor(valor);
			return this.inicio;
		}

		Bloco aux = this.localizaBloco(indice);

		if (aux != null) {
			aux.setValor(valor);
			return aux;
		}
		return null;

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

	public void printListaRecursivo(Bloco aux) {
		if (aux == null) {
			System.out.println("null");
			return;
		}
		System.out.printf(aux.getValor() + " -> ");
		aux = aux.getProximo();
		printListaRecursivo(aux);
	}

	// Desconsiderar este método
	private void trocaBloco(int indice1, int indice2) {

		if (indice1 == indice2) {
			return;
		}

		if (indice1 > indice2) {
			int temp = indice1;
			indice1 = indice2;
			indice2 = temp;
		}

		Bloco bloco1 = this.localizaBloco(indice1);
		Bloco bloco2 = this.localizaBloco(indice2);

		if (bloco1 != null & bloco2 != null) {

			Bloco aux1;
			if (indice1 == 0) {
				aux1 = this.inicio;
			} else {
				aux1 = this.localizaBloco(indice1 - 1);
			}

			Bloco aux2 = this.localizaBloco(indice2 - 1);

			Bloco temp = bloco1.getProximo();
			bloco1.setProximo(bloco2.getProximo());
			aux2.setProximo(bloco1);

			bloco2.setProximo(temp);
			aux1.setProximo(bloco2);

		}
	}

}
