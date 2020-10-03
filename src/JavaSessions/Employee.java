package JavaSessions;

import java.util.ArrayList;

public class Employee {

	
	
	
	public static void main(String[] args) {

//
//		Employee e = new Employee();
//		String s[]=e.getEmpAssets("Rutu");
//		System.out.println("Total no. of assets : "+s.length);
//		
//
//		for(String n : s)
//		{
//			System.out.println(n);
//		}
//		
		Employee e1 = new Employee();
		String assets_sheetal[] = e1.getEmployeeAssets("Naveen");
		
		System.out.println("total assets: " + assets_sheetal.length);

		for (String sd : assets_sheetal) {
			System.out.println(sd);
		}
		
		//Employee e2 = new Employee();

		System.out.println("------");
		
		ArrayList<String> orderList_Tom = e1.getEmpOrders("Tom");
		System.out.println("total orders: " + orderList_Tom.size());
		for(String s : orderList_Tom){
			System.out.println(s);}

	}

	// WAM: where we have to pass the emp name and return the employee assets

	public String[] getEmpAssets(String ename)
	{
		System.out.println("Employee name is "+ename);
		String assets[] = new String[4];
		
		if(ename.equals("Vivek"))
		{
			assets[0] = "Macbook Pro";
			assets[1] = "Mouse";
			assets[2] = "Keyboard";
			assets[3] = "iPhone X";
		}
		else if(ename.equals("Naveen"))
		{
			assets[0] = "Windows Laptop";
			assets[1] = "Mouse";
			assets[2] = "Keyboard";
			assets[3] = "headphone";
		}
		else if(ename.equals("Sam"))
		{
			assets[0] = "Machine";
			assets[1] = "Radio";
			assets[2] = "Keyboard";
			assets[3] = "samsung";
		}
		else
		{
			System.out.println("Employee not found :" +ename);
			return null;
		}
		return assets;
	}


	public String[] getEmployeeAssets(String empName) {
		System.out.println("emp name is : " + empName);
		String asset[] = new String[4];

		if (empName.equals("Sheetal")) {
			asset[0] = "Macbook Pro";
			asset[1] = "Mouse";
			asset[2] = "Keyboard";
			asset[3] = "iPhone X";
		}

		else if (empName.equals("Kiran")) {
			asset[0] = "Windows Laptop";
			asset[1] = "Mouse";
			asset[2] = "Keyboard";
			asset[3] = "headphone";
		}
		
		else{
			System.out.println("this employee " + empName + " is not found, please pass the correct name.....");
			return null;
		}

		return asset;

	}
	public ArrayList<String> getEmpOrders(String empName) {

		System.out.println("getEmpOrders for " + empName);

		ArrayList<String> orderList = new ArrayList<String>();

		if (empName.equals("Tom")) {
			orderList.add("iPhone");
			orderList.add("Laptop");
			orderList.add("Tshirt");
			orderList.add("Shoes");
		}

		else if (empName.equals("Steve")) {
			orderList.add("iPhone");
			orderList.add("Laptop");
		}
		
		else{
			System.out.println("this employee " + empName + " is not found, please pass the correct name.....");
		}

		return orderList;
	}
}
