import java.util.Scanner;

public class CadenaVertical{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		System.out.print("Cadena: ");
		String cad = lea.next();

		int pos=0;
		int longitud = cad.length();

		while( pos < longitud ){
			System.out.println( cad.charAt(pos) );
			pos = pos + 1;
		}
	}
}