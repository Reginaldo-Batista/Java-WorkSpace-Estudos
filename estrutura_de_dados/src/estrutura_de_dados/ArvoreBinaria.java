package estrutura_de_dados;

public class ArvoreBinaria {
	private No raiz = null;

	// Não aceita valores iguais
	public void adicionaNo(int valor) {
		if (this.raiz == null) {
			No novoNo = new No(valor);
			this.raiz = novoNo;
			return;
		}
		if (valor < this.raiz.getValor()) {
			this.adicionaEsquerda(this.raiz, valor);
		} else if (valor > this.raiz.getValor()) {
			this.adicionaDireita(this.raiz, valor);
		}
	}

	private void adicionaEsquerda(No no, int valor) {
		if (no.getEsquerdo() == null) {
			No novoNo = new No(valor);
			no.setEsquerdo(novoNo);
			return;
		}
		No noEsquerdo = no.getEsquerdo();
		if (valor < noEsquerdo.getValor()) {
			this.adicionaEsquerda(noEsquerdo, valor);
		} else if (valor > noEsquerdo.getValor()) {
			this.adicionaDireita(noEsquerdo, valor);
		}

	}

	private void adicionaDireita(No no, int valor) {
		if (no.getDireito() == null) {
			No novoNo = new No(valor);
			no.setDireito(novoNo);
			return;
		}
		No noDireito = no.getDireito();
		if (valor < noDireito.getValor()) {
			this.adicionaEsquerda(noDireito, valor);
		} else if (valor > no.getValor()) {
			this.adicionaDireita(noDireito, valor);
		}
	}

	public void printInOrder(No raiz) {
		if (raiz != null) {
			this.printInOrder(raiz.getEsquerdo());
			System.out.printf(raiz.getValor() + " ");
			this.printInOrder(raiz.getDireito());
		}
	}

	public void printPreOrder(No raiz) {
		if (raiz != null) {
			System.out.printf(raiz.getValor() + " ");
			this.printPreOrder(raiz.getEsquerdo());
			this.printPreOrder(raiz.getDireito());
		}
	}

	public void printPosOrder(No raiz) {
		if (raiz != null) {
			this.printPosOrder(raiz.getEsquerdo());
			this.printPosOrder(raiz.getDireito());
			System.out.printf(raiz.getValor() + " ");
		}
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

}
