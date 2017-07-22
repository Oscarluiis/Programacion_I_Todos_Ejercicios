import java.util.Scanner;

public class Prueba1{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		String nombre;
		int cbals;
		char llevar;
		double st, recargo=0, imp, tp;

		//ingresos--------------
		System.out.print("Nombre: ");
		nombre = lea.nextLine();
		System.out.print("Baleadas: ");
		cbals = lea.nextInt();
		System.out.print("Llevar: ");
		llevar = lea.next().charAt(0);

		//calculos-----------------
		st = cbals * 20;

		if(llevar == 's'){
			recargo = 0.5 * cbals;
		}

		imp = (st+recargo)*0.15;
		tp = st + recargo + imp;

		//imprimir---------------------
		System.out.println("Subtotal: "+st);
		System.out.println("recargo: "+recargo);
		System.out.println("Imp: "+imp);
		System.out.println("Total: "+tp);


	}
}