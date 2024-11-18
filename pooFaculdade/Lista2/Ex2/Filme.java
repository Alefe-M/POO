package Ex2;

public class Filme {

	private String titulo;
	private Diretor diretor;
	private Ator atorPrincipal;
	private Ator atrizPrincipal;

	public Filme(String titulo, Diretor diretor, Ator atorPrincipal, Ator atrizPrincipal) {
		super();
		this.titulo = titulo;
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.atrizPrincipal = atrizPrincipal;
	}

	public String getTitulo() {
		return titulo;

	}

	public Diretor getDiretor() {
		return diretor;
	}

	public Ator getAtorPrincipal() {
		return atorPrincipal;
	}

	public Ator getAtrizPrincipal() {
		return atrizPrincipal;
	}

}
