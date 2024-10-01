package lista_exercicios1_estrutura_de_dados;

import classes_antonio.Fila;
import classes_antonio.Pilha;
import classes_antonio.PilhaFila;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		PilhaFila pilha = new PilhaFila();
		
		pilha.push(5);
		pilha.push(4);
		pilha.push(3);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		pilha.printPilhaFila();
		
	}

}
