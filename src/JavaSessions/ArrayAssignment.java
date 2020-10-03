package JavaSessions;

public class ArrayAssignment {

	public static void main(String[] args) {

		Object obj[] = new Object[6];
		obj[0] = "Vivek";
		obj[1] = 28;
		obj[2] = "CSK";
		obj[3] = "01-01-1992";
		obj[4] = 'M';
		obj[5] = 78.55;
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

		System.out.println("*************");

		Object obj1[] = new Object[6];
		obj1[0] = "Naveen";
		obj1[1] = 30;
		obj1[2] = "MI";
		obj1[3] = "01-01-1990";
		obj1[4] = 'M';
		obj1[5] = 81.33;

		for (Object m : obj1) {
			System.out.println(m);
		}

		System.out.println("*************");

		Object obj2[] = new Object[6];
		obj2[0] = "Kumar";
		obj2[1] = 31;
		obj2[2] = "MI";
		obj2[3] = "01-01-1989";
		obj2[4] = 'F';
		obj2[5] = 68.33;

		for (Object n : obj2) {
			System.out.println(n);
		}

		System.out.println("*************");
		int i[] = new int[5];
		i[0] = 4;
		i[1] = 3;
		i[2] = 2;
		i[3] = 1;
		i[4] = 0;
		int l = i.length;

		for (int p = 0; p < l; p++) {
			System.out.println("n=" + i[p]);
		}
	}

}
