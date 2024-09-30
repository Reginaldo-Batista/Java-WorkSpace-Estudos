package lista_exercicios1_estrutura_de_dados;

import classes_antonio.Fila;
import classes_antonio.Pilha;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		pilha.push(5);
		pilha.push(4);
		pilha.push(3);
		System.out.printf("Topo: " + pilha.topo() + "\n");
		
		pilha.printPilha();
		
	}

}
