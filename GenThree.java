/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = (int) (Math.random() * (b - a)) + a;
		int d = (int) (Math.random() * (b - a)) + a;
		int e = (int) (Math.random() * (b - a)) + a;
		int f = Math.min(c, d);
		int g = Math.min(f, e);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("The minimal generated number was " + g);
	}
}
