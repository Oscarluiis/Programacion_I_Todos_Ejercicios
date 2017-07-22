
public class SystemProperties{
	public static void main(String[] args) {
		String directory = System.getProperty("user.dir");
		System.out.println("Directory: "+directory);

		String os = System.getProperty("os.name");
		System.out.println("OS: "+os);

		//impriman el resto
	}
}