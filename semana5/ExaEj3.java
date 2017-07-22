import java.util.Scanner;

public class ExaEj3{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);
		lea.useDelimiter("\n");

		double st, rec=0, tp, consulta, cirugia;

		String pac = lea.next();
		String dr = lea.next();
		String visita = lea.next();

		if(dr.equalsIgnoreCase("pediatra")){
			consulta = 500;
			cirugia = 30000;
		}
		else if(dr.equalsIgnoreCase("neurologo")){
			consulta = 600;
			cirugia = 35000;
		}
		else if(dr.equalsIgnoreCase("cardiologo")){
			consulta = 700;
			cirugia = 60000;
		}
		else{
			consulta = 750;
			cirugia = 50000;
		}


		if(visita.equalsIgnoreCase("consulta")){
			st = consulta;
		}
		else{
			st = cirugia;
			rec = 5000;
		}

		tp = st + rec;

		System.out.println(sub);
		System.out.println(rec);
		System.out.println(tp);			
	}	
}