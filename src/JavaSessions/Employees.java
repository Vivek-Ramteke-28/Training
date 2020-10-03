package JavaSessions;

public class Employees {

	public static void main(String[] args) {

		
		Employees e = new Employees();
		String e_asset[] = e.getEmployeeAsset("Rutu");

		System.out.println("Total no of assets for " + e_asset);

		for(String obj : e_asset )
		{
			System.out.println(obj);
		}
		
	}

	
	
	public String[] getEmployeeAsset(String name)
	{
		String asset[] = new String[4];
		
		if(name.equals("Vivek")) 
		{
			asset[0] = "A";
			asset[1] = "B";
			asset[2] = "C";
			asset[3] = "D";
		}
		else if(name.equals("Tom"))
		{
			asset[0] = "M";
			asset[1] = "N";
			asset[2] = "O";
			asset[3] = "P";
		}
		else
		{
			System.out.println(name + " Employee is not present");
			return null;
		}
		return asset;
	}
}
