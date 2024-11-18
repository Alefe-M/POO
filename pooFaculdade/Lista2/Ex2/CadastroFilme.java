package Ex2;

import java.util.Scanner;

public class CadastroFilme {

    private static Filme[] filmes = new Filme[10];
    private static Diretor[] diretores = new Diretor[10];
    private static Ator[] atores = new Ator[10];
    private static int countFilmes = 0;
    private static int countDiretores = 0;
    private static int countAtores = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        boolean ganhouOscar;
        do {
            System.out.print("Digite o nome do Diretor: ");
            String nomeDiretor = sc.nextLine();

            System.out.print("O diretor " + nomeDiretor + " ganhou Oscar? (Não - 0 / Sim - 1): ");
            int ganhadorOscar = sc.nextInt();
            sc.nextLine();

            ganhouOscar = (ganhadorOscar == 1);

            Diretor diretor = buscaDiretor(nomeDiretor);
            if (diretor == null) {
                diretor = new Diretor(nomeDiretor, ganhouOscar);
                insereDiretor(diretor);
            }

            System.out.print("Digite o nome do Ator: ");
            String nomeAtor = sc.nextLine();

            System.out.print("Digite a idade do " + nomeAtor + ": ");
            int idadeAtor = sc.nextInt();

            System.out.print("Digite a quantidade de Oscars do " + nomeAtor + ": ");
            int nOscarsAtor = sc.nextInt();
            sc.nextLine();

            Ator ator = buscaAtor(nomeAtor);
            if (ator == null) {
                ator = new Ator(nomeAtor, idadeAtor, nOscarsAtor);
                insereAtor(ator);
            }

            System.out.print("Digite o nome da Atriz: ");
            String nomeAtriz = sc.nextLine();

            System.out.print("Digite a idade da " + nomeAtriz + ": ");
            int idadeAtriz = sc.nextInt();

            System.out.print("Digite a quantidade de Oscars da " + nomeAtriz + ": ");
            int nOscarsAtriz = sc.nextInt();
            sc.nextLine();

            Ator atriz = buscaAtor(nomeAtriz);
            if (atriz == null) {
                atriz = new Ator(nomeAtriz, idadeAtriz, nOscarsAtriz);
                insereAtor(atriz);
            }

            System.out.print("Digite o nome do Filme: ");
            String tituloFilme = sc.nextLine();

            if (buscaFilme(tituloFilme) != null) {
                System.out.println("Erro: Filme com o título '" + tituloFilme + "' já foi cadastrado.");
            } else {
                Filme filme = new Filme(tituloFilme, diretor, ator, atriz);
                if (insereFilme(filme)) {
                    System.out.println("*** Descrição do Filme ***");
                    System.out.println("Título: " + filme.getTitulo());
                    System.out.println("Nome do Diretor: " + diretor.getNome());
                    System.out.println("Nome do Ator principal: " + ator.getNome());
                    System.out.println("Nome da Atriz principal: " + atriz.getNome());
                    System.out.println("*** Descrição do Diretor ***");
                    System.out.println("Nome do Diretor: " + diretor.getNome());
                    System.out.println("Nome do Principal Filme: " + diretor.getPrincipalFilme().getTitulo());
                } else {
                    System.out.println("Falha na inserção do filme.");
                }
            }

            System.out.println("Deseja continuar? (Não - 0 / Sim - 1): ");
            opc = sc.nextInt();
            sc.nextLine();
        } while (opc == 1);

        imprimirDiretoresGanhadoresOscar();

        sc.close();
    }

    public static Filme buscaFilme(String titulo) {
        for (int i = 0; i < countFilmes; i++) {
            if (filmes[i].getTitulo().equalsIgnoreCase(titulo)) {
                return filmes[i];
            }
        }
        return null;
    }

    public static boolean insereFilme(Filme filme) {
        if (countFilmes < filmes.length) {
            filmes[countFilmes++] = filme;
            return true;
        }
        return false;
    }

    public static void insereDiretor(Diretor diretor) {
        if (countDiretores < diretores.length) {
            diretores[countDiretores++] = diretor;
        }
    }

    public static Diretor buscaDiretor(String nome) {
        for (int i = 0; i < countDiretores; i++) {
            if (diretores[i] != null && diretores[i].getNome().equalsIgnoreCase(nome)) {
                return diretores[i];
            }
        }
        return null;
    }

    public static void insereAtor(Ator ator) {
        if (countAtores < atores.length) {
            atores[countAtores++] = ator;
        }
    }

    public static Ator buscaAtor(String nome) {
        for (int i = 0; i < countAtores; i++) {
            if (atores[i] != null && atores[i].getNome().equalsIgnoreCase(nome)) {
                return atores[i];
            }
        }
        return null;
    }

    public static void imprimirDiretoresGanhadoresOscar() {
        System.out.println("\n*** Diretores Ganhadores de Oscar ***");
        for (int i = 0; i < countDiretores; i++) {
            Diretor diretor = diretores[i];
            if (diretor != null && diretor.isGanhadorOscar()) {
                Filme filme = diretor.getPrincipalFilme();
                if (filme != null) {
                    Ator atorPrincipal = filme.getAtorPrincipal();
                    Ator atrizPrincipal = filme.getAtrizPrincipal();
                    System.out.println("Diretor: " + diretor.getNome());
                    System.out.println("Filme: " + filme.getTitulo());
                    System.out.println("Ator principal: " + atorPrincipal.getNome());
                    System.out.println("Atriz principal: " + atrizPrincipal.getNome());
                    System.out.println("--------------------------------");
                }
            }
        }
    }
}
