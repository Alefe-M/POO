package ExVjudge;

import java.util.Scanner;

public class ExB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();

            if (w % 2 == 0 && w >= 4 ){
                int calculo = w / 2;
                System.out.println("Yes");

            }else {
                System.out.println("NO");
            }

        }

    }

