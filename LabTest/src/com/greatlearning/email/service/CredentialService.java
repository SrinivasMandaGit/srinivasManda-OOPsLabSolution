package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

public interface CredentialService {
	
	public String generateEmailAddress(Employee emp, String department);
	
	public char[] generatedPassword();
	
	public void showCredential(Employee emp, String email, char[] generatedPassword);
}
