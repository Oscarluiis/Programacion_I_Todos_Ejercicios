
public class ArrayExpress{
	public static void main(String[] args) {
		char x = 'A';
		char cars[] = { 'H','o','l',x };
		System.out.println(cars);

		//expresss int y lo imprimen
		int arr1[] = {2,0,1,6};
		for(int n : arr1){
			System.out.println("["+n+"]");
		}

		//express String y lo imprimen
		String arr2[] = {"Messi", "Suarez", "Neymar", "Iniesta"};
		for(String cad : arr2){
			System.out.println("["+cad+"]");
		}

		//express double y lo imprimen
		double arr3[] = {3.6, 1.8, 2.5};
		for(double dec : arr3){
			System.out.println("["+dec+"]");
		}
	}
}