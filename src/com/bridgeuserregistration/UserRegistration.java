package com.bridgeuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {



	//	FirstName
	public static void firstNameValidation(String name) {
			String firstNameRegex="^[A-Z]{1}[a-z]{2,}$";
			Pattern pattern=Pattern.compile(firstNameRegex);
			Matcher matcher=pattern.matcher(name);
			if(matcher.find()) {
				System.out.println("its valid");
			}
			else {
				System.out.println("its not valid");
			}
		}
//	LastName
	public static void lastNameValidation(String name) {
		String lastNameRegex="^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern=Pattern.compile(lastNameRegex);
		Matcher matcher=pattern.matcher(name);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("its not valid");
		}
		
	}
//	abc.xyz@bl.co.in
//	Email validation
	public static void emailValidation(String email) {
		String emailRegex="^[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?$";
		Pattern pattern=Pattern.compile(emailRegex);
		Matcher matcher=pattern.matcher(email);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("not valid");
		}
	}
 
//	Mobile Format
	public static void mobileValidation(String mobile) {
		String mobileRegex="^(91|0)?[7-9]{1}+[0-9]{9}$";
		Pattern pattern=Pattern.compile(mobileRegex);
		Matcher matcher=pattern.matcher(mobile);
		if(matcher.find()) {
			System.out.println("its valid ");
		}
		else {
			System.out.println("not valid");
		}
    }
//	password rule 1
	public static void passwordValidationRule1(String password) {
		String passwordRegex="^([A-Za-z0-9]*[//!//@//#//$//%//^//&//*//(//)//_//-//+//=//{//}//[//]//?//>//.//<//,//]*){8}$";
		Pattern pattern=Pattern.compile(passwordRegex);
		Matcher matcher=pattern.matcher(password);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("not valid");
		}
}
//	password rule 2
	public static void passwordValidationRule2(String password) {
		String regexPassword="[A-Za-z0-9]{8}$";
		Pattern pattern=Pattern.compile(regexPassword);
		Matcher matcher=pattern.matcher(password);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("not valid");
		}
}
//	password rule 3
	public static void passwordValidationRule3(String password) {
		String regexPassword="^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
		Pattern pattern=Pattern.compile(regexPassword);
		Matcher matcher=pattern.matcher(password);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("not valid");
		}
	}
//	password rule 4
	public static void passwordValidationRule4(String password) {
		String regexPassword="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
		Pattern pattern=Pattern.compile(regexPassword);
		Matcher matcher=pattern.matcher(password);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("not valid");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the user registration !");
		UserRegistration v = new UserRegistration();
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = sc.next();
		v.firstNameValidation(firstName);
		System.out.println("Enter the last name");
		String lastName = sc.next();
	    v.lastNameValidation(lastName);
	    System.out.println("Enter your email");
		String email = sc.next();
	    v.emailValidation(email);
	    System.out.println("Enter your mobile number");
		String mobile = sc.next();
	    v.mobileValidation(mobile);
	    System.out.println("Enter your password number");
		String password = sc.next();
	    v.passwordValidationRule1(password);
	    System.out.println("Enter your password number");
		String password2 = sc.next();
	    v.passwordValidationRule2(password2);
	    System.out.println("Enter your password number");
		String password3 = sc.next();
	    v.passwordValidationRule3(password3);
	    System.out.println("Enter your password number");
		String password4 = sc.next();
	    v.passwordValidationRule4(password4);
	    
//	    UC_9 check for all the seprately
	    System.out.println("--checking for the valid email--");
	    email = "abc@yahoo.com";
	    emailValidation(email);

        email = "abc-100@yahoo.com";
        emailValidation(email);

        email = "abc.100@yahoo.com";
        emailValidation(email);

        email = "abc111@abc.com";
        emailValidation(email);

        email = "abc-100@abc.net";
        emailValidation(email);

        email = "abc.100@abc.com.au";
        emailValidation(email);

        email = "abc@1.com";
        emailValidation(email);

        email = "abc@gmail.com.com";
        emailValidation(email);

        email = "abc+100@gmail.com";
        emailValidation(email);
        
        
        System.out.println("checking for invalid email");
        
        
        email = "abc";
        emailValidation(email);

        email = "abc@.com.my";
        emailValidation(email);

        email = "abc123@gmail.a";
        emailValidation(email);

        email = "abc123@.com";
        emailValidation(email);

        email = "abc123@.com.com";
        emailValidation(email);

        email = ".abc@abc.com";
        emailValidation(email);

        email = "abc()*@gmail.com";
        emailValidation(email);

        email = "abc@%*.com";
        emailValidation(email);

        email = "abc..2002@gmail.com";
        emailValidation(email);

        email = "abc.@gmail.com";
        emailValidation(email);

        email = "abc@abc@gmail.com";
        emailValidation(email);

        email = "abc@gmail.com.1a";
        emailValidation(email);

        email = "abc@gmail.com.aa.au";
        emailValidation(email);
	
	}
	
}