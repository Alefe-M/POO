package ExVjudge;

import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero inteiro:");
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }

    }
}
