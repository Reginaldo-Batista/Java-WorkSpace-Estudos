package classes_antonio;
public class Bloco {
    
    int valor;
    Bloco prox;
    Bloco anterior;
    
    @Override
    public String toString() {
    	return "" + this.valor;
    }
    
}
