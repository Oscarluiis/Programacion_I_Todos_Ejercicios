import java.util.Scanner;

public class ExaEj1{
	public static void main(String[] args) {
		Scanner lea = new Scanner(System.in);	

		String pal = lea.next();
		boolean pali = true;

		int fin = pal.length() - 1;		

		for(int inicio=0; inicio < fin; inicio++){
			if(pal.charAt(inicio) != pal.charAt(fin)){
				pali = false;
				break;
			}
			
			fin--;
		}


		System.out.println(pali ? "ES PALINDROMO" : "NO ES PALINDROMO");			
	}	
}