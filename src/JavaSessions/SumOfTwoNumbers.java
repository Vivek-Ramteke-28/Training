package JavaSessions;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		SumOfTwoNumbers sum = new SumOfTwoNumbers();
		int cal = sum.add(10, 20);
		System.out.println("Sum of above two numbers are : " + cal);
		
		
		int cal1 = sum.mul(10, 20);
		System.out.println("Product of above two numbers are : " + cal1);

		
		
		
		
	}

	public int add(int x, int y) {
		System.out.println("--Sum of two numbers--");

		int z = x + y;
		return z;
	}
	
	
	
	public int mul(int x, int y) {
		System.out.println("--Multiplication two numbers--");

		int z = x * y;
		return z;
	}
}
