package estrutura_de_dados;

public class MainTestes {

	public static void main(String[] args) {
		
		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBlocoInicio(i);
		}
		lista.printLista();
		System.out.println(lista.localizaBlocoRecursive(1));

	}

}
