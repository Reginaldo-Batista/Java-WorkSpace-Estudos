package estrutura_de_dados;

public class Bloco {

	private int valor = -1;
	private Bloco proximo = null;

	public void addBlocoInicio(int novoValor) {
		Bloco novoBloco = new Bloco();
		novoBloco.valor = novoValor;
		novoBloco.proximo = this.proximo;
		this.proximo = novoBloco;
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
