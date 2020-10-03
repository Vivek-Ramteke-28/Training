package JavaSessions;

public class TwoMethods {

	public static void main(String[] args) {

		TwoMethods t1 = new TwoMethods();
		int max = t1.maximum(-50, 20, 30);
		int max1 = t1.maximum(100, 200, 50);

		System.out.println("----------------");
		
		TwoMethods t2 = new TwoMethods();
		int min = t2.minimum(5, 10, 20);
		int min1 = t2.minimum(-5, 500, -200);
	}

	public int maximum(int a, int b, int c) {
		int num = 0;
		if (a > b && a > c) {
			System.out.println("Greter no. is " + a);
			return a;
		} else if (b > c) {
			System.out.println("Greter no. is " + b);
			return b;
		} else {
			System.out.println("Greter no. is " + c);
			return c;
		}

	}

	public int minimum(int x, int y, int z) {
		int num = 0;
		if (x < y && x < z) {
			System.out.println("Smallest no. is " + x);
			return x;
		} else if (y < z) {
			System.out.println("Smallest no. is " + y);
			return y;
		} else {
			System.out.println("Smallest no. is " + z);
			return z;
		}

	}

}
