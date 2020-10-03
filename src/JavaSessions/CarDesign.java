package JavaSessions;

public class CarDesign {

	String name;
	int price;
	String model;
	static int wheel=4;
	
	
	public void start()
	{
		System.out.println("Start method---");
	}
	
	public void stop()
	{
		System.out.println("Stop method---");
	}
	
	public static void run()
	{
		System.out.println("Run method---");
	}
	
	
	
	public static void main(String[] args) {


		System.out.println(wheel);
		run(); 		// 1. call them directly. no need to create the object

		CarDesign.run(); 		// 2. call by class name:
		
		
		// how to call non static vars and methods: by creating class obj
 
		
		CarDesign c = new CarDesign();
		c.start();
		c.stop();
		

	}

}
