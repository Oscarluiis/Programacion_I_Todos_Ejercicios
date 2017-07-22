
public class Prueba3{
	public static void main(String[] args) {
		int arr1[] = {5,-1,0,8,7,-4,0,-3,1,6};
		int arr2[] = new int[10];

		int pos=0;
		for(int p=0; p < arr1.length; p++){
			if(arr1[p] < 0){
				arr2[pos++] = arr1[p];
			}
		}

		for(int n : arr1){
			if(n == 0){
				arr2[pos++] = n;
			}
		}

		for(int p=0; p < arr1.length; p++){
			if(arr1[p] > 0){
				arr2[pos++] = arr1[p];
			}
		}

		for(int n : arr2){
			System.out.print(n+" ");
		}

		//ordenar con burbuja
		for(int i=1; i < arr1.length; i++){
			for(int j=0; j < arr1.length - i; j++){
				if(arr1[j] > arr1[j+1]){
					int aux = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = aux;
				}
			}
		}

		System.out.println("\nARR1 ordenado: ");
		for(int n : arr1){
			System.out.print(n+" ");
		}
	}
}