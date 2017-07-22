import java.util.Scanner;

public class Notas{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		String obs;
		int nota = lea.nextInt();

		if(nota < 0){
			System.out.println("ERROR");
		}	
		else if (nota < 60) {
			System.out.println("REPROBADO");
		}
		else if (nota < 80) {
			System.out.println("BUENO");
		}
		else if (nota < 90) {
			System.out.println("MUY BUENO");
		}
		else if (nota < 101) {
			System.out.println("SOBRESALIENTE");
		}
		else{
			System.out.println("ERROR");
		}
	}
}