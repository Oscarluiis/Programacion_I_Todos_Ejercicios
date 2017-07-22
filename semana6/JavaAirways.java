import java.util.Scanner;

public class JavaAirways{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		boolean asientos[] = new boolean[10];
		int op;

		do{
			System.out.println("1- Venta Boletos");
			System.out.println("2- Imprimir Asientos");
			System.out.println("3- Despachar Avion");
			System.out.println("4- Salir");
			System.out.print("Escoja opcion: ");
			op = lea.nextInt();

			switch(op){
				case 1:
					//----vender boleto----
					System.out.print("\nPrimera (1) o Economica (2): ");
					int tipo = lea.nextInt();

					int free1=-1, free2=-1;

					//Hay en primera?
					for(int a=0; a < 5; a++){
						if(!asientos[a]){
							free1 = a;
							break; //<-- Para que seguir!
						}
					}
					//Hay en economica?
					for(int a=5; a < 10; a++){
						if(!asientos[a]){
							free2 = a;
							break;
						}
					}

					boolean asignado = false;

					if(tipo==1){
						//primera clase
						if(free1 != -1){
							asignado = true;
							System.out.println("Se le asignara el asiento "+
								free1+" En primera Clase");
							asientos[free1] = true;
						}
						else if(free2 != -1){
							System.out.println("PRIMERA CLASE llena!");
							System.out.println("Pero Hay en Economica, esta bien?: ");
							String resp = lea.next();
							if(resp.equalsIgnoreCase("si")){
								asignado = true;
								System.out.println("Se le asignara el asiento "+
									free2+" En Economica");	
								asientos[free2] = true;
							}
						}
					}
					else{
						//Economica
						if(free2 != -1){
							asignado = true;
							System.out.println("Se le asignara el asiento "+
								free2+" En Economica");
							asientos[free2] = true;
						}
						else if(free1 != -1){
							System.out.println("Economica llena!");
							System.out.println("Pero Hay en Primera Clase, esta bien?: ");
							String resp = lea.next();
							if(resp.equalsIgnoreCase("si")){
								asignado = true;
								System.out.println("Se le asignara el asiento "+
									free1+" En Primera Clase");	
							}
							asientos[free1] = true;
						}	
					}

					if(!asignado){
						System.out.println("Espere el proximo vuelo...");
					}

					//----------------------
					break;
				case 2:
					//-----TODO: Imprimir avion
					System.out.println("\nPrimera Clase\n--------");
					for(int a=0; a < 5; a++){
						System.out.print("|"+asientos[a]);
					}
					System.out.println("\nEconomica\n-------------");
					for(int a=5; a < 10; a++){
						System.out.print("|"+asientos[a]);
					}
					System.out.println();
					//-------------------------
					break;
				case 3:
					//-----TODO: Despachar avion
						/*Poniendo todos los asientos en false
						e imprimiendo el total vendido:
						Primera Clase $600 Economica $300
						*/
					int total=0;
					for(int a=0; a < 10; a++){
						if(asientos[a]){
							asientos[a] = false;

							if(a < 5){
								total += 600;	
							}
							else{
								total += 300;
							}
							
						}	
					}
					System.out.println("Total: "+total);
					//---------------------------
					break;
				case 4:
					System.out.println("Hasta Luego...");
			}

		}while(op!=4);
	}
}