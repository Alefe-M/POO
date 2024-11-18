package Ex2;

public class Ator {

	private String nome;
	private int idade, nOscars;

	public Ator(String nome, int idade, int nOscars) {
		this.nome = nome;
		this.idade = idade;
		this.nOscars = nOscars;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getnOscars() {
		return nOscars;
	}

}
