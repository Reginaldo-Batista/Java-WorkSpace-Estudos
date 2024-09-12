package estrutura_de_dados;

public class Bloco {

	private int valor;
	private Bloco proximo;

	public Bloco() {
		this.valor = 0;
		this.proximo = null;
	}
	
	public Bloco(int novoValor) {
		this.valor = novoValor;
		this.proximo = null;
	}
	
	public Bloco(int novoValor, Bloco novoProximo) {
		this.valor = novoValor;
		this.proximo = novoProximo;
	}
	
	public int getValor() {
		return this.valor;
	}

	public int setValor(int valor) {
		this.valor = valor;
		return this.valor;
	}

	public Bloco getProximo() {
		return proximo;
	}

	public void setProximo(Bloco proximo) {
		this.proximo = proximo;
	}
	
	@Override
	public String toString() {
			return "Valor: " + this.valor + "\n";			
		
	}
	
}
