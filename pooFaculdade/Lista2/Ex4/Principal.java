package Ex4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[6];
		String[] vencedores = new String[3];

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
			String nome = scanner.nextLine();
			System.out.println("Digite o sexo da pessoa " + (i + 1) + ":");
			String sexo = scanner.nextLine();
			System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
			String[] data = scanner.nextLine().split("/");
			Data dataNascimento = new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]),
					Integer.parseInt(data[2]));
			System.out.println("Digite o endereço (logradouro, número, cidade):");
			String[] enderecoDados = scanner.nextLine().split(",");
			Endereco endereco = new Endereco(enderecoDados[0].trim(), enderecoDados[1].trim(), enderecoDados[2].trim());
			pessoas[i] = new Pessoa(nome, sexo, dataNascimento, endereco);
		}

		int[][] jogos = { { 0, 1 }, { 2, 3 }, { 4, 5 } };

		for (int i = 0; i < jogos.length; i++) {
			Pessoa jogador1 = pessoas[jogos[i][0]];
			Pessoa jogador2 = pessoas[jogos[i][1]];
			int pontosJogador1 = 0;
			int pontosJogador2 = 0;

			for (int rodada = 0; rodada < 7; rodada++) {
				int somaJogador1 = jogador1.jogarDadoDe6Faces() + jogador1.jogarDadoDe8Faces();
				int somaJogador2 = jogador2.jogarDadoDe6Faces() + jogador2.jogarDadoDe8Faces();

				if (somaJogador1 > somaJogador2) {
					pontosJogador1++;
				} else if (somaJogador2 > somaJogador1) {
					pontosJogador2++;
				}

				System.out.println("Rodada " + (rodada + 1));
				System.out.println(jogador1.getNome() + " obteve: " + somaJogador1);
				System.out.println(jogador2.getNome() + " obteve: " + somaJogador2);
			}

			if (pontosJogador1 > pontosJogador2) {
				vencedores[i] = jogador1.getNome();
			} else {
				vencedores[i] = jogador2.getNome();
			}

			System.out.println("Vencedor do Jogo " + (i + 1) + ": " + vencedores[i]);
		}

		System.out.println("Vencedores dos jogos:");
		for (String vencedor : vencedores) {
			System.out.println(vencedor);
		}

		scanner.close();
	}
}
