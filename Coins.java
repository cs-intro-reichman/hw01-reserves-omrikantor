/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = a/25;
		int c = b*25;
		int d = a-c;
		System.out.println("use " + b + " quarters " + "and " + d + " cents");
	}
}