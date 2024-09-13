package estrutura_de_dados;

public class Pilha {

	private Bloco topo;
	private int numeroDeBlocos;

	public Bloco getTopo() {
		return topo;
	}

	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}

	public Bloco empilha(int valor) {
		Bloco novoBloco = new Bloco(valor, this.topo);
		this.topo = novoBloco;
		this.numeroDeBlocos++;
		return novoBloco;
	}

	public Bloco desempilha() {
		if (topo != null) {
			Bloco blocoRemovido = this.topo;
			this.topo = topo.getProximo();
			this.numeroDeBlocos--;
			return blocoRemovido;
		}
		return null;
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

}
