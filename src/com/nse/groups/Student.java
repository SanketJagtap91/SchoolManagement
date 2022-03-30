package com.nse.groups;

import com.nse.base.Person;

public class Student extends Person {
	
	public int studentId;
	private double studentPercentage;
	public String courseCode;
	private int counter=101;
	
	
	public Student()
	{
		studentId = counter;
		counter++;
	}
	
	public double getStudentPercentage()
	{
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) 
	{
		if  (studentPercentage <=  100 && studentPercentage > 0)
			this.studentPercentage = studentPercentage;
	}
	
	public static void displayStudentDetails(Student s)
	{
		System.out.println("Student Name           : "+s.Name);
		System.out.println("Student Phone Number   : "+s.getPhoneNumber());
		System.out.println("Student Mail ID Number : "+s.getMailID());
		System.out.println("StudentID              : "+ s.studentId);
		System.out.println("Student Address        : "+ s.Address);
		System.out.println("Student Percentage     : "+s.getStudentPercentage());
		System.out.println("Studen courseCode      : "+s.courseCode);
		System.out.println("Student School Name    : "+ Person.SchoolName);
		System.out.println("Student School Address : "+ Person.SchoolAddress);
		System.out.println(".............................................................................");
	}
}
