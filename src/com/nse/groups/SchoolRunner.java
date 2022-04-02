package com.nse.groups;


public class SchoolRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Professor p1 = new Professor();
		Professor p2 = new Professor();
		Professor p3 = new Professor();
		
		s1.Name = "Sanket";
		s1.setPhoneNumber("9999999");
		s1.setMailID("a@gcom");
		s1.Address = "A Nagar";
		s1.setStudentPercentage(-27);
		s1.courseCode ="CC101";
		
		s2.Name = "Aniket";
		s2.setPhoneNumber("9999999999");
		s2.setMailID("a@g.com");
		s2.Address = "B Nagar";
		s2.setStudentPercentage(65);
		s2.courseCode ="CC102";
		
		s3.Name = "Jay";
		s3.setPhoneNumber("9999999999");
		s3.setMailID("cg.com");
		s3.Address = "c Nagar";
		s3.setStudentPercentage(105);
		s3.courseCode ="CC103";
		
		p1.Name = "Pro. Akshay";
		p1.setPhoneNumber("8888888888");
		p1.setMailID("a@gcom");
		p1.Address = "A Nagar";
		p1.professorId = "P1001";
		p1.departmentId = "DP101";
		p1.departmentName ="Science";
		p1.setExperience(12);
		
		p2.Name = "Pro. Prashant";
		p2.setPhoneNumber("888888");
		p2.setMailID("ag.com");
		p2.Address = "B Nagar";
		p2.professorId = "P1002";
		p2.departmentId = "DP102";
		p2.departmentName ="Math";
		p2.setExperience(2.5);
		
		p3.Name = "Pro. Siddhesh";
		p3.setPhoneNumber("88888888888");
		p3.setMailID("a@g.com");
		p3.Address = "C Nagar";
		p3.professorId = "P1003";
		p3.departmentId = "DP103";
		p3.departmentName ="English";
		p3.setExperience(25);
		
		Student.displayStudentDetails(s1);
		Student.displayStudentDetails(s2);
		Student.displayStudentDetails(s3);
		
		Professor.displayProfessorDetails(p1);
		Professor.displayProfessorDetails(p2);
		Professor.displayProfessorDetails(p3);


	}

}
