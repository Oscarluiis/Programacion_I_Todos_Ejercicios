
import java.util.Scanner;

public class CompararString{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		String c1 = "hola";
		String c2 = lea.next();

		//NO PUEDOOO
		if( c1==c2 ){
			System.out.println("Son Iguales");
		}
		else{
			System.out.println("No Son Iguales");
		}

		//FUAAA CON ESTO SI:
		if( c1.equals(c2) ){
			System.out.println("Son Iguales");
		}
		else{
			System.out.println("No Son Iguales");
		}

		//Y CON ESTO TAMBIEN:
		if( c1.equalsIgnoreCase(c2) ){
			System.out.println("Son Iguales");
		}
		else{
			System.out.println("No Son Iguales");
		}
	}
}