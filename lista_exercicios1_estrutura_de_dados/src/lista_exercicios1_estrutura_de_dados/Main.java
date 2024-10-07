package lista_exercicios1_estrutura_de_dados;

import classes_antonio.Lista;
import classes_antonio.ListaRecursiva;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		ListaRecursiva ListaR = new ListaRecursiva();
		
//		ListaR.addElemento(0, false);
//		ListaR.addElemento(0, false);
//		ListaR.addElemento(0, false);
		
		System.out.println(ListaR.tamanhoRecursivo(ListaR.localizarBloco(1)));
		
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
		
		Lista lista = new Lista();
		
		lista.addElemento(3, true);
		lista.addElemento(3, true);
		lista.addElemento(3, true);
//		lista.addElemento(2, true);
//		lista.addElemento(2, true);
//		lista.addElemento(2, true);

		lista.printLista();
		
		lista.removeDuplicado();
		
		lista.printLista();
		
	}

}
