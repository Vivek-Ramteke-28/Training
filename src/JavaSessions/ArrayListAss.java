package JavaSessions;

import java.util.ArrayList;

public class ArrayListAss {

	public static void main(String[] args) {


		ArrayList< Integer> arl = new ArrayList<Integer>();
		
		arl.add(100);
		arl.add(200);
		arl.add(300);
		arl.add(400);
		arl.add(500);
		
		arl.stream().forEach(arraylist -> System.out.println(arraylist));


		System.out.println("-------------");
		
		
		for(int i = arl.size()-1; i>=0; i--)
		{
			System.out.println(arl.get(i));
		}
		
		System.out.println("-------------");
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("India");//0
		countryList.add("UK");
		countryList.add("USA");
		countryList.add("Germany");
		
		
		countryList.stream().forEach(contries -> System.out.println(contries));
		
		System.out.println("-------Reverse------");
		for(int a = countryList.size()-1; a>=0; a--)
		{
			System.out.println(countryList.get(a));
		}
		
		System.out.println("-------------");
		
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add("Vivek");
		obj.add("Ramteke");
		obj.add(28);
		obj.add('M');
		obj.add(5.50);
		
		for (Object m : obj)
		{
			System.out.println(m);
		}
		
		obj.stream().forEach(n->System.out.println(n));
		
	}

}
