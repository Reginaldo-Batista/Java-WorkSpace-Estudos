package classes;

public class Administrador extends Pessoa {

	private int numeroContrato;
	
	public Administrador() {
		super();
		this.numeroContrato = -1;
	}

	public Administrador(String nome, int idade, String cpf, String endereço, int numeroContrato) {
		super(nome, idade, cpf, endereço);
		this.setNumeroContrato(numeroContrato);
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

}
