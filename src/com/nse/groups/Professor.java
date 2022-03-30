package com.nse.groups;

import com.nse.base.Person;

public class Professor extends Person {
	public String professorId;
	public String departmentId;
	public String departmentName;
	private double experience;
	
	
	
	public double getExperience() 
	{
		return experience;
	}
	public void setExperience(double experience)
	{
		if (experience > 0)
			this.experience = experience;
	}
	
	public static void displayProfessorDetails(Professor p)
	{
		System.out.println("Professor Name            : "+p.Name);
		System.out.println("Professor Phone Number    : "+p.getPhoneNumber());
		System.out.println("Professor Mail ID Number  : "+p.getMailID());
		System.out.println("Professor ID              : "+ p.professorId);
		System.out.println("Department ID             : "+p.departmentId);
		System.out.println("Professor Department Name : "+p.departmentName);
		System.out.println("Professor Address 		  : "+ p.Address);
		System.out.println("Professor School Name     : "+ Person.SchoolName);
		System.out.println("Professor School Address  : "+ Person.SchoolAddress);		
		System.out.println("Professor Experience	  : "+ p.getExperience());
		System.out.println(".............................................................................");

		
	}	
}
