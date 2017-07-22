
public class Ciclo1{
	public static void main(String[] args) {
		int cont=1, suma=0;

		while(cont <= 10){
			System.out.println(cont);
			System.out.println("suma: "+suma+"+"+cont);
			suma = suma+cont;
			cont = cont+1;
		}	

		System.out.println("Suma total: "+suma);
	}
}