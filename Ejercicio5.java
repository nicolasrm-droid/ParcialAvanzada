/**
 * @author Nicolas Rojas  , Adriana
 *
 */ 

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero, digito =0;
		System.out.println("Ingrese un numero: ");
		numero= teclado.nextInt();
		
		
		if(numero <0) {
			System.out.println("No escriba numeros negativos :)");
			return;
		}
		else
			if(numero == 0 ) {
				System.out.println("no escriba 0 por favor");
				return ;
			}

		int aux=numero;
		
		while (numero != 0) {
			digito= digito + (numero % 10 );
			numero= numero / 10 ;
			
		}
		System.out.println("sumando digitos: " + aux);
		
		System.out.println("la suma de los digitos es: " + digito );


	}


}
