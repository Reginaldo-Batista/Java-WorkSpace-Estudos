package estrutura_de_dados;

public class MainTestes {

	public static void main(String[] args) {
		
		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBlocoEm(i, 0);
		}
		lista.printLista();

	}

}
