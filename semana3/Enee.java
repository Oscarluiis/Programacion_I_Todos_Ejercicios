import java.util.Scanner;

public class Enee{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		String cliente, zona, tipo;
		double kvs, st=0, desc=0, tp;

		cliente = lea.nextLine();
		zona = lea.next().toUpperCase();
		tipo = lea.next();
		kvs = lea.nextDouble();

		if(zona.equals("RESIDENCIAL")){
			st = 50 * kvs;
		}
		else if(zona.equals("BARRIO")){
			st = 30 * kvs;	
		}
		else if(zona.equals("NEGOCIO")){
			st = 20*kvs;
		}
		else if(zona.equals("GOBIERNO")){
			st = 10 * kvs;
		}
		else{
			System.out.println("Zona Erronea");
		}

		if(tipo.equalsIgnoreCase("DIPLOMATICO")){
			desc = st * 0.5;
		}

		tp = st - desc;

		System.out.println("St: "+ st);
		System.out.println("Desc: "+ desc);
		System.out.println("Tp: "+tp);
	}
}