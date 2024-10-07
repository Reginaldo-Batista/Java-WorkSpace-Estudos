package classes_antonio;

public class ListaRecursiva extends Lista {

	@SuppressWarnings("unused")
	public Bloco localizaBlocoRecursivo(int indice) {
	
		if (indice <= 0) {
			return this.inicio;
		}
	
		Bloco aux = localizaBlocoRecursivo(indice - 1);
	
		if (aux != null) {
			return aux.prox;
		}
		return null;
	
	}
	
	@SuppressWarnings("unused")
	public int tamanhoRecursivo(Bloco aux) {

		if (aux == null) {
			return 0;
		}

		return 1 + tamanhoRecursivo(aux.prox);

	}
	
}
