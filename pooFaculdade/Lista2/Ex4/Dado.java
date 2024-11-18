package Ex4;

import java.util.Random;

public class Dado {

	private int numeroDeFaces;

	public Dado(int numeroDeFaces) {
		this.numeroDeFaces = numeroDeFaces;
	}

	public int jogar() {
		Random random = new Random();
		return random.nextInt(numeroDeFaces) + 1; // Gera número entre 1 e numeroDeFaces
	}

	public int getNumeroDeFaces() {
		return numeroDeFaces;
	}

	public void setNumeroDeFaces(int numeroDeFaces) {
		this.numeroDeFaces = numeroDeFaces;
	}
}
