package estrutura_de_dados;

public class Pilha {

	private int numeroDeBlocos;
	private Bloco topo;

	public void addBloco(int valor) {
		Bloco novoBloco = new Bloco(valor, this.topo);
		this.topo = novoBloco;
		this.numeroDeBlocos++;
	}

	public void removeBloco() {
		if (topo != null) {
			this.topo = topo.getProximo();
			this.numeroDeBlocos--;
		}
	}

	public void printPilha() {

		Bloco aux = this.topo;

		if (aux == null) {
			System.out.println("Pilha vazia!");
			return;
		}

		System.out.printf("Existem %d blocos nesta pilha:\n", this.numeroDeBlocos);
		System.out.printf("Topo: ");
		while (aux != null) {
			System.out.printf(aux.getValor() + " -> ");
			aux = aux.getProximo();
		}
		System.out.println("null");
	}

	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}

	public Bloco getTopo() {
		return topo;
	}

}
