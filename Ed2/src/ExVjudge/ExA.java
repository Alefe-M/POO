package ExVjudge;

import java.util.ArrayList;
import java.util.Scanner;

public class ExA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();

        String valores = sc.nextLine();

        String[] partes = valores.split(" ");

        numeros.add(Integer.parseInt(partes[0]));
        numeros.add(Integer.parseInt(partes[1]));

        int soma = numeros.get(0) + numeros.get(1);

        System.out.println(soma);

    }
}
