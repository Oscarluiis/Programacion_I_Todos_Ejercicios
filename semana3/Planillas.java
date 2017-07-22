import java.util.Scanner;

public class Planillas{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int azul = lea.nextInt();
		int roja = lea.nextInt();
		int amar = lea.nextInt();

		if(azul > roja && azul > amar){
			System.out.println("AZUL GANADORA");
		}	
		else if (roja > amar) {
			System.out.println("ROJA GANADORA");
		}
		else{
			System.out.println("AMARILLA GANADORA");
		}
	}
}