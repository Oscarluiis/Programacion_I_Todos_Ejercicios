import java.util.Scanner;

public class Menu4{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int op;

		do{
			System.out.println("1- Tabla de Multiplicacion");
			System.out.println("2- Vocales en Palabra");
			System.out.println("3- Mayor y Menor Ingresados");
			System.out.println("4- Numero Al reves");
			System.out.println("5- Salir");
			System.out.print("Opcion: ");
			op = lea.nextInt();

			switch (op) {
				case 1:
					//----MULTI
					System.out.print("\nTabla del: ");
					int num = lea.nextInt();

					for(int t=1; t <= 10; t++){
						int res = num*t;
						System.out.println(num+" x "+t+" = "+res);
					}
					System.out.println();
					//----MULTI
					break;
				case 2:
					System.out.println("\nTODO Vocales en Palabra\n");
					break;
				case 3:
					System.out.println("\nTODO Mayor y Menor\n");
					break;
				case 4:
					System.out.println("\nTODO Numero Al reves\n");
					break;
				case 5:
					System.out.println("\nHasta Luego...");
					break;
				default:
					System.out.println("\nPor favor Ingrese un numero Correcto\n");
			}

		}while(op!=5);
	}
}