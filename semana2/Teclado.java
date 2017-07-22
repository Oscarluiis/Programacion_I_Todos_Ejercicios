import java.util.Scanner;

public class Teclado{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		//entero
		System.out.print("Ingrese un entero: ");
		int n = lea.nextInt();
		//Double
		System.out.print("Ingrese un decimal: ");
		double d = lea.nextDouble();
		//texto
		System.out.print("Ingrese un texto: ");
		String t = lea.next();
		//caracter
		System.out.print("Ingrese un caracter: ");
		char l = lea.next().charAt(0);

		System.out.println("Entero: "+n);
		System.out.println("Decimal: "+d);
		System.out.println("Texto: "+t);
		System.out.println("Caracter: "+l);
	}
}