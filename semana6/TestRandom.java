import java.util.Random;

public class TestRandom{
	public static void main(String[] args) {
		Random ran = new Random();

		//el valor aleatorio >= 0 && < limite
		int x = ran.nextInt(5);
		System.out.println(x);
	}
}