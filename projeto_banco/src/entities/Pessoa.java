package entities;

public class Pessoa {

	private String nome;
	private String cpf;
	private String contato;

	@SuppressWarnings("unused")
	private Conta conta;

	public String toString() {
		return nome + "\n" + 
				cpf + "\n" +
				contato + "\n";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

}
