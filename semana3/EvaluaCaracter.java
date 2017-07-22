import java.util.Scanner;

public class EvaluaCaracter{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		char cara = lea.next().toUpperCase().charAt(0);

		if(cara == 'A' || cara == 'E' || cara == 'I'
			|| cara == 'O' || cara == 'U'){

			System.out.println("ES VOCAL");
		}
		else if (cara == '0' || cara == '1' || 
			cara == '2'|| cara == '3' || cara == '4' ||
			cara == '5'|| cara == '7' || cara == '7' ||
			cara == '8'|| cara == '9') {
			
			System.out.println("ES DIGITO");
		}
		else{
			System.out.println("OTRO CARACTER");
		}
	}
}