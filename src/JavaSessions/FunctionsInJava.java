package JavaSessions;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.printName();
		int add = obj.add();
		System.out.println(add);
		

	}

	//no input and no return i.e. output
	public void test()
	{
		System.out.println("Test Method");
	}
	
	public void printName()
	{
		System.out.println("Vivek");
	}
	
	
	
	public int add()
	{
		int a = 100;
		int b = 200;
		int c = a+b;
		return c;
	}
	
	
	
}
