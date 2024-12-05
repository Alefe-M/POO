package Q2;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);

        
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("****Relatório****");
        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos se estivesse vivo.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos se estivesse vivo.");
    }
}
