package Alua01;

import java.util.Scanner;

public class Aula01 {

    public enum resultado{
        Vitoria, Derrota, Empate, Jogando
    }

    private static char[][] criarMatriz(){
        char[][] t={
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        return t;
    }


    private static void mostrarMatriz(char[][] tabuleiro){
        System.out.println(" 1 2 3 ");
        System.out.println("a|"+tabuleiro[0][0]+"|"+tabuleiro[0][1]+"|"+tabuleiro[0][2]+"|a");
        System.out.println("b|"+tabuleiro[1][0]+"|"+tabuleiro[1][1]+"|"+tabuleiro[1][2]+"|b");
        System.out.println("c|"+tabuleiro[2][0]+"|"+tabuleiro[2][1]+"|"+tabuleiro[2][2]+"|c");
        System.out.println(" 1 2 3 ");
    }

    public static String lerEntrada(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Faça uma jogada Exemplo:(a1):");
        String entrada = sc.nextLine();
        return entrada.trim().toLowerCase();

    }


    public static int[] converterEntrada(String entrada){
        if (entrada.length() !=2){
            return null;
        }

        char linha = entrada.charAt(0);
        char coluna = entrada.charAt(1);

        int linhaIndex;
        int colunaIndex;

        switch (linha) {
            case 'a':
                linhaIndex = 0;
                break;
            case 'b':
                linhaIndex = 1;
                break;
            case 'c':
                linhaIndex = 2;
                break;
            default:
                return null;
        }
        if (coluna >= '1' && coluna <= '3'){
            colunaIndex = coluna - '1';
        }else {
            return null;
        }
        return new int[]{linhaIndex, colunaIndex};
        
    }

    public static boolean verificarJogada(char[][] tabuleiro, int[] coordenadas) {
        int linha = coordenadas[0];
        int coluna = coordenadas[1];

        if (tabuleiro[linha][coluna] == ' ') {
            return true;

        } else {
            System.out.println("Posição já ocupada. Tente outra.");
            return false;
        }
    }

    public static resultado verificarResultado(char[][] tabuleiro){
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != ' ' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return tabuleiro[i][0] == 'X' ? resultado.Vitoria : resultado.Derrota;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] != ' ' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return tabuleiro[0][i] == 'X' ? resultado.Vitoria : resultado.Derrota;
            }
        }
        if (tabuleiro[0][0] != ' ' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return tabuleiro[0][0] == 'X' ? resultado.Vitoria : resultado.Derrota;
        }
        if (tabuleiro[0][2] != ' ' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return tabuleiro[0][2] == 'X' ? resultado.Vitoria : resultado.Derrota;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return resultado.Jogando;
                }
            }
        }

        return resultado.Empate;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jogadorX;
        int vitoriasX = 0, vitoriasO = 0, empates = 0;

        do {
            char[][] tabuleiro = criarMatriz();
            jogadorX = true; // X começa sempre
            resultado res;

            // Loop do jogo
            do {
                mostrarMatriz(tabuleiro);
                System.out.println("Jogador " + (jogadorX ? "X" : "O") + ", é sua vez.");

                boolean jogadaValida;
                do {
                    String entrada = lerEntrada();
                    int[] coordenadas = converterEntrada(entrada);

                    if (coordenadas != null && verificarJogada(tabuleiro, coordenadas)) {
                        tabuleiro[coordenadas[0]][coordenadas[1]] = jogadorX ? 'X' : 'O';
                        jogadaValida = true;
                        jogadorX = !jogadorX; // Alterna jogador
                    } else {
                        jogadaValida = false;
                    }
                } while (!jogadaValida);

                res = verificarResultado(tabuleiro);
            } while (res == resultado.Jogando);

            // Mostra o resultado final
            mostrarMatriz(tabuleiro);
            switch (res) {
                case Vitoria:
                    System.out.println("Jogador X venceu!");
                    vitoriasX++;
                    break;
                case Derrota:
                    System.out.println("Jogador O venceu!");
                    vitoriasO++;
                    break;
                case Empate:
                    System.out.println("Empate!");
                    empates++;
                    break;
            }

            // Exibe placar
            System.out.println("Placar: X (" + vitoriasX + ") - O (" + vitoriasO + ") - Empates (" + empates + ")");
            System.out.println("Deseja jogar novamente? (s/n)");
        } while (sc.nextLine().trim().equalsIgnoreCase("s"));


        }
    }
