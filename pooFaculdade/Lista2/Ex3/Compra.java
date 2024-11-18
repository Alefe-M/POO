package Ex3;

public class Compra {

	private Pessoa pessoa;
	private Produto produto;

	public Compra(Pessoa pessoa, Produto produto) {
		super();
		this.pessoa = pessoa;
		this.produto = produto;
	}

	public void comprar(Pessoa pessoa, Produto produto) {
		this.pessoa = pessoa;
		this.produto = produto;
	}

	public Compra() {
		this.pessoa = null;
		this.produto = null;
	}

	public String verificarCompra() {
		return "Compra realizada com sucesso! " + pessoa.consultaNome() + " comprou o produto: "
				+ produto.consultaNome() + " no endereço: " + pessoa.consultaEndereco().consultaLogradouro() + ".";
	}

}
