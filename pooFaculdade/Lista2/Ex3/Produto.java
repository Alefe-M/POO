package Ex3;

public class Produto {

	private long codigo;
	private String nome;

	public String consultaNome() {
        return nome;
    }

	public Produto(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
