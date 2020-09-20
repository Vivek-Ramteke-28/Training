package SeleniumSession;

public class Calculation {

	public static void main(String[] args) {
		
		
		int a = -5;
		int b= 8;
		int c = 6;
		int result1 = a+b*c;
		
		System.out.println(result1);

		
		
		int m = 5;
		int n = 15;
		int o = 3;
		int p = 2;
		int q = 8;
		
		int result2 = m+n/o*p-q%o;
		System.out.println(result2);
		
		
		
		
		float val1 = 25.5f;
		float val2 = 3.5f;
		float val3 = 40.5f;
		float val4 = 4.5f;
		
		double result3 = ((val1*val2-val2*val2)/(val3-val4));
		
		System.out.println(result3);
		
	}

}
