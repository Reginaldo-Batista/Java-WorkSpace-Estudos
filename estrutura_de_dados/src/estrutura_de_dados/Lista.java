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
		return aux;

	}

	public void addBlocoRecursivo(int valor, int indice, Bloco auxBloco) {
		
		if (this.inicio == null) {
			this.addBloco(99);
			auxBloco = this.inicio;

			if (indice == 0) {
				this.inicio.setValor(valor);
				return;
			}
		}

		Bloco blocoAnterior = this.localizaBloco(indice - 1);

		if (blocoAnterior != null) {
			Bloco novoBloco = new Bloco(valor, blocoAnterior.getProximo());
			blocoAnterior.setProximo(novoBloco);
			return;
		}
		Bloco novoBloco = new Bloco(99);
		auxBloco.setProximo(novoBloco);
		auxBloco = novoBloco;
		this.addBlocoRecursivo(valor, indice, auxBloco);

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

		if (blocoAnterior != null && blocoAnterior.getProximo() != null) {
			Bloco blocoAlvo = blocoAnterior.getProximo();
			blocoAnterior.setProximo(blocoAlvo.getProximo());
			this.numeroDeBlocos--;
		}

	}

	public void trocaBloco(int indice1, int indice2) {

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

	public void printListaRecursivo(Bloco aux) {
		if (aux == null) {
			System.out.println("null");
			return;
		}
		System.out.printf(aux.getValor() + " -> ");
		aux = aux.getProximo();
		printListaRecursivo(aux);
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

	public Bloco getInicio() {
		return this.inicio;
	}

}
