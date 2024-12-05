package Q2;

import Q1.Data;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private Data dataDeNascimento;

    
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataDeNascimento = new Data(dia, mes, ano);
        calculaIdade(); 
    }

    
    public void calculaIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(dataDeNascimento.getAno(), dataDeNascimento.getMes(), dataDeNascimento.getDia());
        this.idade = hoje.getYear() - nascimento.getYear();

        
        if (hoje.getMonthValue() < nascimento.getMonthValue() ||
            (hoje.getMonthValue() == nascimento.getMonthValue() && hoje.getDayOfMonth() < nascimento.getDayOfMonth())) {
            this.idade--;
        }
    }

    
    public int informaIdade() {
        return idade;
    }

   
    public String informaNome() {
        return nome;
    }

    
    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.dataDeNascimento = new Data(dia, mes, ano);
        calculaIdade(); 
    }

    
    
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Data de Nascimento: " + dataDeNascimento;
    }
}
