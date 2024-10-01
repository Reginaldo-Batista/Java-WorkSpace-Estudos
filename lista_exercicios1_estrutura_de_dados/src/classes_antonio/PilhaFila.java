package classes_antonio;

public class PilhaFila {

	Fila fila = new Fila();

	public void push(int valor) {
		this.fila.push(valor);
	}
	
	public Bloco pop() {
		return this.fila.lista.removerElementoFim();
	}
	
	public void printPilhaFila() {
		this.fila.printFila();
	}

}
