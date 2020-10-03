package JavaSessions;

public class Function {

	public static void main(String[] args) {
		
		
		Function f = new Function();
		int m = f.getStudentMarks("Vivek");
		System.out.println(m);
		

	}
	
	
	
	public int getStudentMarks(String name)
	{
		int marks = 0;
		System.out.println("Getting marks for student "+ name );
		
		if (name.equals("Vivek"))
		{
			marks = 90;
		}
		else if (name.equals("Tom"))
		{
			marks = 70;
		}
		else
		{
			System.out.println("Please enter valid details");
			return -1;
		}
		
		return marks;
	}

}
