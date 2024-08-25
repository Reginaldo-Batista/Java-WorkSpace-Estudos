package estrutura_de_dados;

public class Bloco {

	private int valor;
	private Bloco proximo;
	
	public int getValor() {
		return this.valor;
	}
	
	public Bloco() {
		this.valor = 0;
		this.proximo = null;
	}
	
	public Bloco(int novoValor) {
		this.valor = novoValor;
	}

	public void addBlocoInicio(int novoValor) {
		Bloco novoBloco = new Bloco();
		novoBloco.valor = novoValor;
		novoBloco.proximo = this.proximo;
		this.proximo = novoBloco;
		this.valor++;
	}

	public void addBlocoFim(int novoValor) {

		if (this.proximo == null) {
			this.addBlocoInicio(novoValor);
		} else {
			Bloco novoBloco = new Bloco();
			novoBloco.valor = novoValor;

			Bloco aux = this.proximo;
			while (aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = novoBloco;
			this.valor++;
		}

	}

	public void addBloco(int novoValor, int indice) {
		if (indice <= 0 || indice > this.valor - 1) {
			System.out.println("Posição inválida!");
		} else {
			Bloco novoBloco = new Bloco(novoValor);
			Bloco auxBloco = this.proximo;
			int auxIndice = 0;
			while (auxIndice < indice - 1) {
				auxBloco = auxBloco.proximo;
				auxIndice++;
			}
			novoBloco.proximo = auxBloco.proximo;
			auxBloco.proximo = novoBloco;
			this.valor++;

		}
	}

	public void imprimeBlocos() {

		if (this.proximo != null) {
			Bloco aux = this.proximo;
			while (aux != null) {
				System.out.printf("%d -> ", aux.valor);
				aux = aux.proximo;
			}
			System.out.println("null");

		} else {
			System.out.println("Lista vazia!");
		}
	}

}
