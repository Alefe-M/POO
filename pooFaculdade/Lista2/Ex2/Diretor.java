package Ex2;

public class Diretor {

	private String nome;
	private boolean ganhadorOscar;
	private Filme principalFilme;

	public Diretor(String nome, boolean ganhadorOscar, Filme principalFilme) {
		this.nome = nome;
		this.ganhadorOscar = ganhadorOscar;
		this.principalFilme = principalFilme;

	}
	
	public Diretor(String nome, boolean ganhadorOscar) {
        this.nome = nome;
        this.ganhadorOscar = ganhadorOscar;
    }

	public String getNome() {
		return nome;
	}

	public boolean isGanhadorOscar() {
		return ganhadorOscar;
	}

	public void setPrincipalFilme(Filme principalFilme) {
		this.principalFilme = principalFilme;
	}

	public Filme getPrincipalFilme() {
		return principalFilme;
	}
}
