package com.company;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
          int num;

            Scanner validar = new Scanner(System.in);
            System.out.println("Ingrese un numeroo");
            num = validar.nextInt();

            metodos mt = new metodos();
            Scanner sc = new Scanner(System.in);
            String cad = sc.nextLine().toUpperCase();
            while (!cad.equals("FIN")) {
                if (cad.length() < 100) {
                    System.out.println(mt.hexaAdd(cad));
                }
                cad = sc.nextLine().toUpperCase();
            }
        }

    }

    /* Adriana Anzola & Nicolas Rojas*/


