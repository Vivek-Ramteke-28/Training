package JavaSessions;

public class CircumferencOfCircle {

	public static void main(String[] args) {
		
		CircumferencOfCircle cc = new CircumferencOfCircle();
		float ccs = cc.circleCircum(5);
		System.out.println("circumference of circle is " + ccs);

	}

	
	public float circleCircum(int a)
	{
		System.out.println("---circumference of circle---");
		float x = 3.14f;
		float c = 2*x*a;
		return c;
	}
}
