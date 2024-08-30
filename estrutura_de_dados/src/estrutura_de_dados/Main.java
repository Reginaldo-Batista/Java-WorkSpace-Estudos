package estrutura_de_dados;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Lista();

		for (int i = 0; i < 3; i++) {
			lista.addBlocoInicio(i);
		}

		lista.printLista();

	}

}