package lista_exercicios1_estrutura_de_dados;

import classes_antonio.ListaDupla;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
//		Lista lista = new Lista();
//		lista.addElemento(1, false);
//		lista.addElemento(2, false);
//		lista.addElemento(3, false);
//		lista.addElemento(4, false);
//		lista.addElemento(5, false);
//		lista.addElemento(999, 5);
//		lista.addElemento(888, 5);
//		
//		lista.printLista();
		
		ListaDupla listaD = new ListaDupla();
		
		listaD.addElemento(5, true);
		listaD.addElemento(3, true);
		listaD.addElemento(1, true);
		
		listaD.printLista();
		listaD.printListaInvertida();
	}

}
