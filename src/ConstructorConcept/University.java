package ConstructorConcept;

import java.util.ArrayList;

public class University {
	
	
	String name;
	String country;
	String establishDate;
	ArrayList<String> course;

	
	public University(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
	
	public University(String name, String country, String establishDate, ArrayList<String> course )
	{
		this.name = name;
		this.country = country;
		this.establishDate = establishDate;
		this.course = course;
	}
	
	
}
