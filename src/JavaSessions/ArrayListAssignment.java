package JavaSessions;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {

		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Vivek");
		ar.add("Ramteke");
		ar.add("QA");
		ar.add("Nagpur");
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
			
		}
		
		System.out.println("-----------------------");
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		ar1.add(500);
		
		System.out.println(ar.get(2));
		
		System.out.println(ar.size());
		for(Integer i : ar1)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		ar1.add(0, 50);
		
		ar1.add(6, 600);
		
		for(Integer i : ar1)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------");
		ar1.remove(2);
		
		for(Integer i : ar1)
		{
			System.out.println(i);
		}
	}

}
