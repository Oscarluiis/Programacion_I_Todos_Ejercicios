
public class Shortcuts{
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x++);
		System.out.println(++x);

		int y = x++;
		System.out.println(y);
		y = ++x;
		System.out.println(y);

		x=4;
		y = ++x * 3;
		System.out.println(y);
	}
}