import java.util.Scanner;

public class Array10{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		//declarar e inicializar el arreglo
		int numeros[] = new int[10];

		//ingresar los 10 valores
		for(int p=0; p < 10; p++){
			System.out.print("["+p+"]: ");
			numeros[p] = lea.nextInt();
		}

		//imprimirlos
		int suma=0;

		/*for(int p=0; p < 10; p++){
			System.out.print("["+numeros[p]+"]");	
			suma += numeros[p];
		}*/

		for(int num : numeros){
			System.out.print("["+num+"]");	
			suma += num;	
		}

		System.out.println("\nSuma: "+suma);
	}
}