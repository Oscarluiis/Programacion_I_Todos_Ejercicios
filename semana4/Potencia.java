
/*
Ingresar:
	-Una base y un exponente
Calcular y presentar:
	- potencia

Ej: 2^3 = 1x2=2x2=4x2=8
*/
import java.util.Scanner;

public class Potencia{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		System.out.print("Base: ");
		int base = lea.nextInt();

		System.out.print("Expo: ");
		int expo = lea.nextInt();

		int conteo=0, potencia=1;

		while(conteo < expo){
			potencia *= base;
			conteo++;
		}

		System.out.println("Potencia: "+potencia);
	}
}