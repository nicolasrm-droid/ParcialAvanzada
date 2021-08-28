import java.util.Scanner;

public class Ejercicio8{

	static void convertirirTernario(int N){

		if (N == 0)
			return;

		int x = N % 3;
		N /= 3;
		if (x < 0)
			N += 1;
		convertirirTernario(N);


		if (x < 0)
			System.out.print( x + (3 * -1));
		else
			System.out.print(x);
		
	}

	  


	static void convertir(int Decimal)	{

		System.out.print("El numero ternario de  "  + Decimal +  "\nes: ");


		if (Decimal != 0) {
			convertirirTernario(Decimal);
		}
		else
			System.out.println("0");
	}


	public static void main (String[] args)	{

		try (Scanner teclado = new Scanner(System.in)) {
			int Decimal = 0;
			System.out.println("Por favor escriba su numero: " );
			Decimal=teclado.nextInt();
			convertir(Decimal);
		}

		catch(Exception e) {
			System.out.println("Solo escribe numeros");
			}
	}
}

