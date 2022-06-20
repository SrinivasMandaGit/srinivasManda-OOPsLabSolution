package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		CredentialService service = new CredentialServiceImpl();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		Employee emp = new Employee(firstName,lastName);
		
		//String department = "";
		String[] department =new String[]{"tech","admin","hr","legal"}; 
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();
		
		
		if (option==0) {
		
			System.out.println("Please enter the details again!!");
			//System.exit(0);				
		}
		else {
			generatedEmail = service.generateEmailAddress(emp, department[option-1]);
			generatedPassword = service.generatedPassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
		}
		
		
		
		/*switch (option) {
		
		case 0:
			System.out.println("Please enter the details again!!");
			System.exit(0);
			break;
		
		case 1:
			department = "tech";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatedPassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			
			break;
			
		case 2:
			department = "admin";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatedPassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			
			break;
			
		case 3:
			department = "hr";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatedPassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			
			break;
	
		case 4:
			department = "legal";
			generatedEmail = service.generateEmailAddress(emp, department);
			generatedPassword = service.generatedPassword();
			service.showCredential(emp, generatedEmail, generatedPassword);
			
			break;
			
		}*/
		
	}
}
