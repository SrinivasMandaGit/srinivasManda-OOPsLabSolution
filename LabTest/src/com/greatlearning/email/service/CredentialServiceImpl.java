package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;
import java.util.Random;

public class CredentialServiceImpl implements CredentialService {
	
	String email;
	char[] generatedPassword;

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+department+".greatlearning.com";
	}

	@Override
	public char[] generatedPassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		
		
		Random random = new Random();
		char[] password = new char[8];
		
			
		for (int i=0; i < password.length; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	@Override
	public void showCredential(Employee emp, String email, char[] generatedPassword) {
		
		System.out.println("Dear " + emp.getFirstName() + " " + emp.getLastName());
		System.out.println("Your generated credentials are as follows");
		System.out.println("Email :" + email);
		System.out.println("Password : ");
		System.out.println(generatedPassword);		

	}

}
