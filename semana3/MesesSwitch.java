import java.util.Scanner;

public class MesesSwitch{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);

		int mes = lea.nextInt();

		if(mes > 0 && mes < 13){
			switch (mes) {
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Tienen 30 dias");
					break;
				case 2:
					System.out.println("Tiene 29 dias");
					break;
				default:
					System.out.println("Tienen 31 dias");

			}
		}	
		else{
			System.out.println("Mes Incorrecto");
		}
	}
}