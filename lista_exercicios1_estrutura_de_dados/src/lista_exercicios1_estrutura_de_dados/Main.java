package lista_exercicios1_estrutura_de_dados;

import classes_antonio.Lista;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		lista.addElemento(1, false);
		lista.addElemento(2, false);
		lista.addElemento(3, false);
		lista.addElemento(4, false);
		lista.addElemento(0, 4);
		
		lista.printLista();
		
		
		
	}

}
