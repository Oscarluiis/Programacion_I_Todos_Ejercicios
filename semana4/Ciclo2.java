
/*
Vamos a estar ingresando numeros HASTA que el usuario
   ingrese un valor negativo.
   	- Sumar todos los valores ingresados
   	- Contar e imprimir Cuantos valores se ingresaron
   	- Promedio de numeros ingresados
   	- EXTRA: Cuantos fueron pares
*/
import java.util.Scanner;
public class Ciclo2{
	public static void main(String[] args) {
		int num, suma=0, cont=0, promedio, pares=0;
		Scanner lea = new Scanner(System.in);

		while( true ){
			System.out.print("Numero: ");
			num = lea.nextInt();

			if(num < 0){
				break;
			}
			
			cont = cont+1;
			suma = suma + num;	

			if(num % 2 == 0){
				pares = pares+1;
			}

		}

		promedio = suma / cont;

		System.out.println("Suma: "+suma);
		System.out.println("Numeros ingresados: "+cont);
		System.out.println("Pares: "+ pares);
		System.out.println("Promedio: "+promedio);
	}
}