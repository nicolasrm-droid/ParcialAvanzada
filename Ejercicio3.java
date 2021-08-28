/**
 * @author Nicolas Rojas  , Adriana Anzola
 *
 */ 


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        int nump = Integer.parseInt(teclado.nextLine());
	        ArrayList<Integer> dia = new ArrayList<>();
	        while (nump != 0) {
	            if (nump >= 2 && nump <= 5) {
	                String dias = teclado.nextLine();
	                for (int i = 0; i < nump; i++) {
	                    dia.add(Integer.parseInt(dias.split(" ")[i]));
	                }
	                int i = 2;
	                int planeta = 0;
	                while (planeta < (dia.size())) {
	                    if (i % dia.get(planeta) == 0) {
	                        planeta++;
	                    } else {
	                        i++;
	                        planeta = 0;
	                    }
	                }
	                System.out.println(i);
	                dia.clear();
	            }
	            nump = Integer.parseInt(teclado.nextLine());
	        }
	    }
	}
