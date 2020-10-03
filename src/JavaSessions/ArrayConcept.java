package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[1]);
		
		System.out.println(a.length);
		
		System.out.println("---------");

		for (int m=0; m<a.length;m++)
		{
			System.out.println(a[m]);
		}
		
		System.out.println("---------");
		String str[] = new String[3];
		
		str[0] = "Vivek";
		str[1] = "Ramteke";
		str[2] = "QA";
		
		String s = "ViVeK";
				
		System.out.println(str.length);
		
		for(int n=0; n<str.length;n++)
		{
			System.out.println(str[n]);
		}
		
		
		if(str[0].equalsIgnoreCase(s))
		{
			System.out.println("First progress");
		}
		else
		{
			System.out.println("Need Practice");
		}
		System.out.println("---------");
		
		
		
		int b[] = new int[5];
		
		b[0]= 1;
		b[1]= 2;
		b[2]= 3;
		b[3]= 4;
		b[4]= 5;
		
		System.out.println(b.length);
		
		for(int x=0; x<b.length; x++)
		{
			System.out.println(b[x]);
		}
		System.out.println("---------");
		for(int y : b)
		{
			System.out.println(y);
		}
		System.out.println("---------");
		
		Object obj[] = new Object[3];
		obj[0] = "Vivek";
		obj[1] = 'R';
		obj[2] = 28;
		
		for(Object o: obj)
		{
			System.out.println(o);
		}
		
		System.out.println("---------");
		
		for(int x=0; x<obj.length; x++)
		{
			System.out.println(obj[x]);
		}
		
		
	}

}
