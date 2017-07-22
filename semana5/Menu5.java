import java.util.Scanner;

public class Menu5{
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
					//------------vocales

					String pal = lea.next().toUpperCase();
					int vocales=0;

					for(int c=0; c < pal.length(); c++){
						switch(pal.charAt(c)){
							case 'A':
							case 'E':
							case 'I':
							case 'O':
							case 'U':
								vocales++;
						}
					}

					System.out.println(pal+ " tiene "+vocales+" vocal(es)\n");

					//----------------------
					break;
				case 3:
					//------------mayor a menor-----
					String resp;
					int mayor = Integer.MIN_VALUE;
					int menor = Integer.MAX_VALUE;

					do{
						System.out.print("\nNumero: ");
						num = lea.nextInt();

						if(num > mayor){
							mayor = num;
						}

						if(num < menor){
							menor = num;
						}

						System.out.print("Queres otro?: ");
						resp = lea.next();
					}while(resp.equalsIgnoreCase("SI"));

					System.out.println("Mayor: "+mayor+"-Menor: "+
						menor+"\n");

					//-----------------------------
					break;
				case 4:
					//-----Al reves----
					System.out.println("\nNumero: ");
					num = lea.nextInt();
					
					//patito
					String alreves = ""+num;
					for(int c=alreves.length()-1; c >= 0; c--){
						System.out.print(alreves.charAt(c));
					}
					System.out.println();

					//elegante
					while(num > 0){
						System.out.print(num%10);
						num /= 10;
					}

					System.out.println("\n");
					//-------
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