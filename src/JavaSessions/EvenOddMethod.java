package JavaSessions;

public class EvenOddMethod {

	public static void main(String[] args) {

		EvenOddMethod eo = new EvenOddMethod();
		int x = eo.evenOdd(5);
		int x1 = eo.evenOdd(20);

	}

	public int evenOdd(int num) {

		if (num % 2 == 0) {
			System.out.println(num + "--Number is even no.");
		} else if (num % 2 == 1) {
			System.out.println(num + "--Number is odd no.");

		}
		return num;
	}

}
