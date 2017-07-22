import java.util.Scanner;

public class EvaluaCaracterSwitch{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		char cara = lea.next().toUpperCase().charAt(0);

		switch (cara) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("ES VOCAL");
				break;
			case '1':
				System.out.println("ES DIGITO");
				break;
			default:
				System.out.println("ES OTRO");
		}
	}
}