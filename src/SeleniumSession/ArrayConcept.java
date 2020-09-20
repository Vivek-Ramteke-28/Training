package SeleniumSession;

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
	}

}
