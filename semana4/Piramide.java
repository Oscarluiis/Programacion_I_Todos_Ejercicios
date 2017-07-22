import java.util.Scanner;

public class Piramide{
	public static void main(String[] args) {
		
		Scanner lea = new Scanner(System.in);
		int filas = lea.nextInt();
		int f=1;

		while( f <= filas){
			int c=1;
			while(c <= f){
				System.out.print("*");
				c++;
			}
			System.out.println("");
			++f;
		}


	}
}