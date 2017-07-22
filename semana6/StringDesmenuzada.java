import java.util.Scanner;

public class StringDesmenuzada{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		System.out.print("Palabra: ");
		String pal = lea.next();	

		//declarar el arreglo e inicializarlo con la
		//longitud de la palabra
		int n = pal.length();
		char caras[] = new char[n];

		//pasar los valores e imprimir
		for(int p=0; p < n; p++){
			caras[p] = pal.charAt(p);
			System.out.println("["+caras[p]+"]");	
		}
	}
}