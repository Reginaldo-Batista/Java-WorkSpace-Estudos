package classes_antonio;

public class FilaPilha {
	
	Pilha pilha = new Pilha();
	
	public void push(int valor) {
		this.pilha.push(valor);
	}
	
	public Bloco pop() {
		return this.pilha.lista.removerElementoInicio();
	}
	
	public void printFilaPilha() {
		this.pilha.printPilha();
	}

}
