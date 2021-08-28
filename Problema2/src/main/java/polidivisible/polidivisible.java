
package polidivisible;

import java.util.Scanner;

public class polidivisible {
    public static void main(String args[]) {

        int num;

        Scanner validar = new Scanner(System.in);

        System.out.println("Ingrese un numeroo");
        num = validar.nextInt();

        metodos mt = new metodos();
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        if (mt.val(cad)) {
            if (mt.esPol(Integer.parseInt(cad))) {
                System.out.println("POLIDIVISIBLE");
            } else {
                System.out.println("NO POLIDIVISIBLE");
            }
        }
    }
}

