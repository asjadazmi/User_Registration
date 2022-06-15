package com.bridgeuserregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
//	FirstName
	public static void firstNameValidation(String name) {
			String firstNameRegex="^[A-Z]{1}[a-z]{2}$";
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
		String lastNameRegex="^[A-Z]{1}[a-z]{2}$";
		Pattern pattern=Pattern.compile(lastNameRegex);
		Matcher matcher=pattern.matcher(name);
		if(matcher.find()) {
			System.out.println("its valid");
		}
		else {
			System.out.println("its not valid");
		}
		
	}
//	Email validation
	public static void emailValidation(String email) {
		String emailRegex="^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
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
	public static void main(String[] args) {
		System.out.println("Welcome to the user registration !");
		UserRegistration v = new UserRegistration();
	    Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first name");
//		String firstName = sc.next();
//		v.firstNameValidation(firstName);
//		System.out.println("Enter the last name");
//		String lastName = sc.next();
//	    v.lastNameValidation(lastName);
//	    System.out.println("Enter your email");
//		String email = sc.next();
//	    v.emailValidation(email);
	    System.out.println("Enter your mobile number");
		String mobile = sc.next();
	    v.mobileValidation(mobile);
	    
	}
	
	}
	
