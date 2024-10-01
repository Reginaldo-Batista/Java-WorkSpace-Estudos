package lista_exercicios1_estrutura_de_dados;

import classes_antonio.Fila;
import classes_antonio.FilaPilha;
import classes_antonio.Pilha;
import classes_antonio.PilhaFila;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		pilha.push(5);
		pilha.push(4);
		pilha.push(3);
		pilha.push(2);
		pilha.push(1);
		pilha.pop();
		pilha.printPilha();
		
//		Fila fila = pilha.filaEquivalente();
//		
//		fila.pop();
//		fila.printFila();
		
		
		
	}

}
