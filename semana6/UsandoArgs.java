
public class UsandoArgs{
	public static void main(String[] args) {
		boolean found = false;

		for(int p=0; p < args.length; p++){
			System.out.println("["+args[p]+"]");

			if(args[p].equalsIgnoreCase("carlos")){
				found = true;
			}
		}

		System.out.println(found ? "Esta" : "No Esta");
	}
}