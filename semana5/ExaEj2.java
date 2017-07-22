import java.util.Scanner;

public class ExaEj2{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int productos=0, sumat = 0;
		String otro;

		double precio, total;

		do{
			int prod = lea.nextInt();
			int cant = lea.nextInt();

			switch (prod) {
				case 1:
					precio = 2.98;
					break;
				case 2:
					precio = 4.5;
					break;
				case 3:
					precio = 9.98;
					break;
				case 4:
					precio = 4.49;
					break;
				default:
					precio = 6.87;
			}
			total = cant * precio;
			System.out.println(total);

			productos += cant;
			sumat += total;

			otro = lea.next();

		}while(otro.equals("SI"));

		System.out.println(productos);
		System.out.println(sumat);	
	}	
}