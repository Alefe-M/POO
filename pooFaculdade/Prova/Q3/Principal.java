package Q3;

public class Principal {

    public static void main(String[] args) {
    	//TODO 
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        
        System.out.println("****Relatório****");
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879, princeton);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643, cambridge);

        System.out.println(einstein.apresentar());
        System.out.println(newton.apresentar());
    }
}
