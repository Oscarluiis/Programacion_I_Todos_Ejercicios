import java.util.Scanner;

public class MisVentas{
	public static void main(String[] args) {
		//variables a usar----
		String nombre;
		int salario;
		double ventas, comis, rap, tp;
		Scanner lea = new Scanner(System.in);

		//ingresos
		System.out.print("Nombre: ");
		nombre = lea.nextLine();
		System.out.print("Salario: ");
		salario = lea.nextInt();
		System.out.print("Ventas: ");
		ventas = lea.nextDouble();

		//calculos
		comis = ventas * 0.08;
		rap = salario * 0.035;
		tp = salario + comis - rap;

		//imprimir
		System.out.println("Comision: "+comis);
		System.out.println("Rap: "+rap);
		System.out.println("Total: "+tp);
	}
}