package estrutura_de_dados;

public class MainTestes {

	public static void main(String[] args) {
		
		Bloco teste = new Bloco();
		System.out.println(teste.setValor(5));
		
		// Estudo com lista
		Lista lista = new Lista();
		for (int i = 0; i < 5; i++) {
			lista.addBloco(i);
		}
		lista.printLista();
		System.out.printf("Elemento removido: " + lista.removeBloco(4));
		lista.printLista();

	}

}
