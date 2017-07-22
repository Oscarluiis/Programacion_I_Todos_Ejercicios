

/*
INGRESAR DEL TECLADO:
	-Nombre cliente con espacios
	-Plan A o (cualquier otra cosa)
	-Cantidad de minutos hablados
CALCULAR E IMPRIMIR:
	- Sub total
		* Plan A cuesta $50
		* Los demas cuesta $20
	- Recargo
		* Plan A regala 200 minutos La diff de minutos 
		  se cobra $0.2*minuto adicional
		* Los demas regalan solo 100 minutos. la diff
		  se cobra $0.5*minuto adicional
    - total
*/

import java.util.Scanner;

public class Tigo{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		String cliente;
		char plan;
		double mins, tp, st, recargo=0; 

		//ingresos---
		cliente = lea.nextLine();
		plan = lea.next().charAt(0);
		mins = lea.nextDouble();

		//calculos
		if(plan == 'A'){
			st = 50;
			if(mins > 200){
				recargo = (mins-200)*0.2;
			}
		}
		else{
			st = 20;
			if(mins > 100){
				recargo = (mins-100)*0.5;
			}
		}

	}
}