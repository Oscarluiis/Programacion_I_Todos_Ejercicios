import java.util.Scanner;

public class Diagonal{

	/*
	INGRESAR una String y al final imprimirla en diagonal.
	Ej: Hondo
	H
	 o
	  n
	   d
	    o
	*/
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);	

		System.out.print("Palabra: ");
		String pal = lea.nextLine();
		String spaces = "";

		//estrategia 1
		for(int c=0; c < pal.length(); c++){
			System.out.println(spaces + pal.charAt(c));
			spaces = spaces + " ";
		}

		//estrategia 2
		int espacios=0;
		for(int c=0; c < pal.length(); c++){
			for(int e=0; e < espacios; e++){
				System.out.print(" ");
			}
			System.out.println(pal.charAt(c));
			espacios++;
		}
	}
}