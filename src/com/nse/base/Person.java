package com.nse.base;

public abstract class Person {
	public String Name;
	private String PhoneNumber;
	private String MailID;
	public String Address;
	public static String SchoolName = "NDNVP";
	public static String SchoolAddress = "NDNVP,Lasalgaon,Nashik";
	
	
	
	
	
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		if (mailID.contains("@")&& mailID.contains(".com"))
			MailID = mailID;
		else
			MailID ="Invalid Mail ID - "+ mailID ;
		
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length()==10)
			PhoneNumber = phoneNumber;
		else
			PhoneNumber = "Invalid Mobile Number - "+ phoneNumber;
	}
	
    public abstract void displayPersonDetails();
}
