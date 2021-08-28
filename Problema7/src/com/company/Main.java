package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;
        while (true) {
            sum = 0;


            Scanner validar = new Scanner(System.in);

            System.out.println("Ingrese un numeroo");
            a = validar.nextInt();


            System.out.println("Ingrese un numeroo");
            b = validar.nextInt();

            if (a == 0 && b == 0)
                break;
            while (a != 0 || b != 0) {
                if ((a % 10) + (b % 10) >= 10) {
                    sum++;
                    a = a + 10;
                }
                a = a / 10;
                b = b / 10;
            }
            if (sum == 0) {
                System.out.print("No carry operation.\n");
            } else if (sum == 1) {
                System.out.print("1 carry operation.\n");
            } else {
                System.out.printf("%d carry operations.\n", sum);
            }


        }
    }
}













