package com.greatlearning.email.test;


import java.util.Random;


public class TestPassword {

	public static void main(String[] args) {

	Random random = new Random();
	
	//public static void main(String[] args) {
	//String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//System.out.println(capitalLetters.toLowerCase());
	//}
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>";
	String passwordRange = capitalLetters+smallLetters+numbers+specialCharacters;
	
	char[] password = new char[8];
	
	//for (int j=0; j<20; j++) {
		
		for (int i=0; i < password.length; i++) {
			password[i] = passwordRange.charAt(random.nextInt(passwordRange.length()));
			}	
		//}
	System.out.println(password);
	}
}