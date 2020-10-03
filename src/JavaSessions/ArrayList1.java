package JavaSessions;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		System.out.println(ar.size());
		
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.get(2));
		
		System.out.println(ar.size());
		
		System.out.println("------------");
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		

	}

}
