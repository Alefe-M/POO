package Q3;

import Q1.Data;

public class Pessoa {
    String nome;
    int idade;
    Data dataDeNascimento;
    Universidade universidade;

    public Pessoa(String nome, int dia, int mes, int ano, Universidade universidade) {
        this.nome = nome;
        this.dataDeNascimento = new Data(dia, mes, ano);
        this.universidade = universidade;
        calcularIdade();
    }

    void calcularIdade() {
        int anoAtual = java.time.LocalDate.now().getYear();
        int mesAtual = java.time.LocalDate.now().getMonthValue();
        int diaAtual = java.time.LocalDate.now().getDayOfMonth();

        idade = anoAtual - dataDeNascimento.getAno();
        if (mesAtual < dataDeNascimento.getMes() || 
           (mesAtual == dataDeNascimento.getMes() && diaAtual < dataDeNascimento.getDia())) {
            idade--;
        }
    }

    String getNome() {
        return nome;
    }

    String getUniversidade() {
        return universidade.getNome();
    }

    String apresentar() {
        return nome + " trabalha na universidade " + universidade.getNome();
    }
}
