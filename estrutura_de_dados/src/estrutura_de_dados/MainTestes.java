package estrutura_de_dados;

public class MainTestes {

	public static void main(String[] args) {
		
		// Estudo com lista
		Lista lista = new Lista();
//		for (int i = 0; i < 5; i++) {
//			lista.addBloco(i);
//		}
		lista.addBlocoRecursivo(21, 0, lista.getInicio());
		lista.addBlocoRecursivo(21, 3, lista.getInicio());
		lista.printLista();

	}

}
