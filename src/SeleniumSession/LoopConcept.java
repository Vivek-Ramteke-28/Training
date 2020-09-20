package SeleniumSession;

public class LoopConcept {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		
		int a=0;
		while(a<=5)
		{
			System.out.println(a);
			a++;
		}
		System.out.println("-----------------");
		
		
		for(int even=0; even<=10; even=even+2)
		{
			System.out.println(even);
		}
		
		System.out.println("-----------------");
		
		for(int odd=1; odd<=10; odd=odd+2)
		{
			System.out.println(odd);

		}
		
		
		System.out.println("-----------------");
		
		int num=20;
		for(num=0; num<=20; num++)
		{
			if(num%2==0)
		
			System.out.println(num);
		}
	}

}
