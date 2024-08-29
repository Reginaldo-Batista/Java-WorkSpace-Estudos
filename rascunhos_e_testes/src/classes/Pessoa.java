package classes;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private String endereço;

	public Pessoa() {
		this.nome = null;
		this.idade = -1;
		this.cpf = null;
		this.endereço = null;
	}

	public Pessoa(String nome, int idade, String cpf, String endereço) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
