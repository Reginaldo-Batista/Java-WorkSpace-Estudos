package estrutura_de_dados;

public class Main {

	public static void main(String[] args) {

		Bloco inicio = new Bloco();
		
		inicio.addBlocoInicio(1);
		inicio.addBlocoInicio(2);
		inicio.addBlocoInicio(3);
		inicio.addBlocoInicio(4);
		
		inicio.addBlocoFim(5);
		inicio.addBlocoFim(6);
		inicio.addBlocoFim(7);
		
		inicio.imprimeBlocos();
	}
}