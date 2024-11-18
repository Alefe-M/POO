package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		Scanner sc = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();

		do {

			System.out.print("Informe o nome:");
			String nome = sc.nextLine();

			System.out.print("Digite a matrícula:");
			int matricula = sc.nextInt();

			System.out.print("Digite a N1:");
			double nb1 = sc.nextDouble();

			System.out.print("Digite a N2:");
			double nb2 = sc.nextDouble();

			Aluno al = new Aluno(matricula, nome, nb1, nb2);
			alunos.add(al);

			System.out.print("Deseja continuar? (0- Não; 1- Sim): ");
			opc = sc.nextInt();
			sc.nextLine();
		} while (opc == 1);

		System.out.println("Situação Alunos:");

		for (Aluno al : alunos) {
			double media = al.calculaMedia();
			String situacao = (media >= 6.0) ? "Aprovado" : "Reprovado";
			System.out.println("Aluno: " + al.getNome() + " | Matrícula: " + al.getMatricula() + " | Média: "
					+ media + " | Situação: " + situacao);
		}

		sc.close();
	}
	}


