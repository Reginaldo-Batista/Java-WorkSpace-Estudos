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

	public Bloco localizaBlocoRecursive(int indice) {
		
		if (indice <= 0 || this.inicio == null) {
			return this.inicio;
		}
		
		Bloco aux = localizaBlocoRecursive(indice - 1);
		return aux.getProximo();		

	}

	public Bloco addBlocoForcedRecursive(int valor, int indice) {

		if (indice == 0) {
			return this.addBlocoInicio(valor);
		}

		Bloco blocoAnterior = this.localizaBloco(indice - 1);
		if (blocoAnterior != null) {
			return this.addBlocoEm(valor, indice);
		}
		this.addBlocoFim(0);
		return this.addBlocoForcedRecursive(valor, indice);

	}

	public Bloco addBlocoInicio(int valor) {

		Bloco novoBloco = new Bloco(valor, this.inicio);
		this.inicio = novoBloco;
		this.numeroDeBlocos++;
		return novoBloco;

	}

	public Bloco addBlocoEm(int valor, int indice) {

		if (indice == 0 || this.inicio == null) {
			return this.addBlocoInicio(valor);
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

	public Bloco addBlocoFim(int valor) {

		if (this.inicio == null) {
			return this.addBlocoInicio(valor);
		}

		Bloco ultimoBloco = this.localizaBloco(this.numeroDeBlocos - 1);

		Bloco novoBloco = new Bloco(valor);
		ultimoBloco.setProximo(novoBloco);
		this.numeroDeBlocos++;
		return novoBloco;

	}

	public Bloco removeBlocoInicio() {

		if (this.inicio != null) {
			Bloco primeiroBloco = this.inicio;
			this.inicio = primeiroBloco.getProximo();
			this.numeroDeBlocos--;
			return primeiroBloco;
		}
		return null;

	}

	public Bloco removeBlocoEm(int indice) {

		if (indice == 0) {
			return this.removeBlocoInicio();
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

	public Bloco removeBlocoFim() {
		Bloco ultimoBloco = this.localizaBloco(this.numeroDeBlocos - 1);
		Bloco penultimoBloco = this.localizaBloco(this.numeroDeBlocos - 2);
		penultimoBloco.setProximo(null);
		return ultimoBloco;
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
