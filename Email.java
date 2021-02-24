package emailApp;

import java.util.Scanner;

public class Email {
	
	/* Required Fields are - 
				First name
				Last name
				Password
				Department
				Mail capacity
				Alternate mail
				default pass length
		Encapsulation used to these fields to keep it away from any user
	*/
	
	private String firstName; 
	private String lastName;
	private String password;
	private String department;
	private int mailCapacity = 500;
	private final int defaultPassLeng = 8;
	private String email;
	private String extension = ".companyname.com";
	private String alternateMail;
	
	// Constructor to receive First name & last name
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	// Calls method asking for department & return department
		this.department = setDepartment();
		
	// Calls a method to return random password
		this.password = setPassword(defaultPassLeng);
		System.out.println("Your Password is: " + this.password);
		
	// Combine elements to generate mail
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department.toLowerCase() + extension;
		System.out.println("Your Email: " + email);		
	}
	
	// Ask for the department
	private String setDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey " + firstName + ", Select your Department Codes: \n 1 for Development\n 2 for Sales\n 3 for Analyst\n 4 for Finance" );
		System.out.println();
		System.out.print("Enter Your Department code: ");
		int deptCode = sc.nextInt();
		if(deptCode == 1) {
			return "Development";
		}
		else if(deptCode == 2) {
			return "Sales";
		}
		else if(deptCode == 3) {
			return "Analyst";
		}
		else if(deptCode == 4) {
			return "Finance";
		}
		else {
			return "Others";
		}
	}
	
	// Random password generator
	public String setPassword(int length) {
		String passValues = "abcdefghijklmnopqrstuvwxyz0123456789@$&#";
		char [] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passValues.length());
			password[i] = passValues.charAt(rand);
		}
		return new String(password);
	}
	
	// Setting mail box capacity
	public void setMailboxCapacity(int capacity) {
		this.mailCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String mail) {
		this.alternateMail = mail;
	}
	
	// Change the password	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailCapacity() {
		return mailCapacity;
	}
	
	public String getAlternameEmail() {
		return alternateMail;
	}
	
	public String getchangePassword() {
		return password;
	}
	
	public String showInfo() {
		
		System.out.println("Your Info");
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMAPNY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailCapacity + "mb";
	}
}
