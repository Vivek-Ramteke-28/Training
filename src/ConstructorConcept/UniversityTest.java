package ConstructorConcept;

import java.util.ArrayList;

public class UniversityTest {

	public static void main(String[] args) {

		University un1 = new University("RTMNU", "India");
		System.out.println(un1.name + " " + un1.country);

		ArrayList<String> courseList = new ArrayList<String>();
		courseList.add("Electronics Engg");
		courseList.add("CSE  Engg");
		courseList.add("Mech Engg");
		courseList.add("Civil Engg");

		University un2 = new University("RTMNU", "India", "01-01-1980", courseList);
		System.out.println(un2.name + " " + un2.country + " " + un2.establishDate + " " + un2.course);

	}

}
