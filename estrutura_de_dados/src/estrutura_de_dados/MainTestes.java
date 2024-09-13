package estrutura_de_dados;

public class MainTestes {

	public static void main(String[] args) {
		
		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBlocoInicio(i);
		}
		lista.printLista();
		System.out.println(lista.localizaBlocoRecursive(-15));
		System.out.println(lista.localizaBlocoRecursive(0));
		System.out.println(lista.localizaBlocoRecursive(1));
		System.out.println(lista.localizaBlocoRecursive(2));
		System.out.println(lista.localizaBlocoRecursive(5));
		System.out.println(lista.localizaBlocoRecursive(15));

	}

}
