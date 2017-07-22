import java.util.Scanner;

public class TecladoConEspacio{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int x = lea.nextInt();
		String a = lea.nextLine();
		String b = lea.nextLine();
		

		System.out.println(a);
		System.out.println(b);

		//----Cambiando delimitador
		System.out.println("----Cambiando delimitador:");

		lea.useDelimiter("\r\n");

		x = lea.nextInt();
		a = lea.next();
		b = lea.next();
		

		System.out.println(a);
		System.out.println(b);

	}
}