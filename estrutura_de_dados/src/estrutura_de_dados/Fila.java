package estrutura_de_dados;

public class Fila {

	private int numeroDeBlocos;
	private Bloco inicio;
	private Bloco fim;

	public Fila() {
		this.numeroDeBlocos = 0;
		this.inicio = null;
		this.fim = null;
	}

	public void addBloco(int valor) {

		Bloco novoBloco = new Bloco(valor);

		if (this.fim != null) {
			this.fim.setProximo(novoBloco);
			this.fim = novoBloco;
			this.numeroDeBlocos++;
			return;
		}
		this.fim = novoBloco;
		this.inicio = novoBloco;
		this.numeroDeBlocos++;
	}

	public void removeBloco() {

		if (this.inicio != null && this.inicio != this.fim) {
			this.inicio = this.inicio.getProximo();
			this.numeroDeBlocos--;
			return;
		}
		this.inicio = null;
		this.fim = null;

	}

	public void printFila() {

		Bloco aux = this.inicio;

		if (aux == null) {
			System.out.println("Fila vazia!");
			return;
		}

		System.out.printf("Existem %d blocos nesta fila:\n", this.numeroDeBlocos);
		System.out.printf("Início: ");
		while (aux != null) {
			System.out.printf(aux.getValor() + " -> ");
			aux = aux.getProximo();
		}
		System.out.println("null");
	}

	public Bloco getInicio() {
		return inicio;
	}

	public void setInicio(Bloco inicio) {
		this.inicio = inicio;
	}

	public Bloco getFim() {
		return fim;
	}

	public void setFim(Bloco fim) {
		this.fim = fim;
	}

	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}

}
