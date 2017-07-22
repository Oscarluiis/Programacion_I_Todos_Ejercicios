import java.util.Scanner;

public class Primo{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		System.out.print("Numero: ");
		int num = lea.nextInt();

		int cont=1, divi=0;

		while(cont <= num){
			if(num % cont == 0){
				divi = divi + 1;
			}
			cont = cont + 1;
		}	

		//Reto: Hacer lo siguiente con operador ternario----
		if(divi == 2){
			System.out.println("Numero es Primo?: SI");
		}
		else{
			System.out.println("Numero es Primo?: NO");
		}
	}
}