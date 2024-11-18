package Ex3;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endereco endereco = new Endereco("Rua das Flores", "São Paulo", "SP");

		Pessoa pessoa = new Pessoa("João Silva", endereco, "123");

		Produto produto1 = new Produto(1, "Notebook");
		Produto produto2 = new Produto(2, "Smartphone");

		Compra compra = new Compra();
		compra.comprar(pessoa, produto1);

		System.out.println(compra.verificarCompra());

	}

}
