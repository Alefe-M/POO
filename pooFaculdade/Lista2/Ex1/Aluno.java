package Ex1;

public class Aluno {
	private int matricula;
	private String nome;
	private double nb1, nb2;

	public Aluno(int matricula, String nome, double nb1, double nb2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nb1 = nb1;
		this.nb2 = nb2;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNb1() {
		return nb1;
	}

	public void setNb1(double nb1) {
		this.nb1 = nb1;
	}

	public double getNb2() {
		return nb2;
	}

	public void setNb2(double nb2) {
		this.nb2 = nb2;
	}

	public double calculaMedia() {
		return (nb1 + nb2) / 2;
	}
}
