import java.util.Scanner;

public class CuadradoPerfecto {
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);	

		int num = lea.nextInt();

		int multi = 0, cont=1;

		while(multi < num){
			multi = cont * cont;
			cont++;
			
		}	

		if(multi == num){
			System.out.println("ES PERFECTO");
		}
		else{
			System.out.println("NO ES PERFECTO");
		}
	}	
}