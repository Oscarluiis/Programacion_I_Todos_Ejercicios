import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int num = lea.nextInt();
		int facto=1;

		for(int c=1; c <= num; c++){
			facto *= c;
		}	

		System.out.println("Factorial: "+facto);
	}
}