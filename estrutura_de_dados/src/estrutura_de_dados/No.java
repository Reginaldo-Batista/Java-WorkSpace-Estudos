package estrutura_de_dados;

public class No {
	private int valor;
	private No esquerdo;
	private No direito;
	
	public No() {
		this.valor = 0;
		this.esquerdo = null;
		this.esquerdo = null;
	}

	public No(int valor) {
		this.valor = valor;
		this.esquerdo = null;
		this.direito = null;
	}
	
	public No(int valor, No esquerdo, No direito) {
		this.valor = valor;
		this.esquerdo = esquerdo;
		this.direito = direito;
	}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}
	
	

	
	
}
