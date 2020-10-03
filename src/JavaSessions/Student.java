package JavaSessions;

public class Student {
		
	
	String name = "Vivek";
	static int age=28;
	
	
	
	public static void main(String[] args) {

		Student s = new Student();
		
	
		System.out.println(s.name);
		System.out.println(age);
		
		System.out.println("-----------------");
		int m = s.getMarks("Vivek");
		System.out.println(m);
		
		int n = s.getMarks("Rutu");
		System.out.println(n);
		
	}

	
	public int getMarks(String name)
	{
		System.out.println("Getting marks of student "+name);
		int marks = 0;
		
		if(name.equals("Vivek"))
		{
			System.out.println("Here is the marks of student: "+ name);
			marks = 60;
		
		}
		else if(name.equals("Ashwin"))
		{
			System.out.println("Here is the marks of student: "+ name);
			marks = 70;
			
		}
		else if(name.equals("Naveen"))
		{
			System.out.println("Here is the marks of student: "+ name);
			marks = 90;
		
		}
		else
		{
			System.out.println("Student data is not available for "+name);
			return -1;
		}
		
		return marks;
	}
	
}
