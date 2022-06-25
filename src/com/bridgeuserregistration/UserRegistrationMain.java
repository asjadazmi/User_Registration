package com.bridgeuserregistration;

import java.util.Scanner;

public class UserRegistrationMain extends UserRegistration{
	public static void main(String[] args) {
		 System.out.println("---------- Welcome To User Registration ----------");

	        Scanner sc = new Scanner(System.in);
	        

	        System.out.println("Enter Your First Name");
	        String firstName = sc.next();
	        while(true) {
	        try {
	            validateFirstName.validateFirstName(firstName);
	        } catch (ValidateException e) {
	            e.printStackTrace();
	            System.out.println("Please enter first name: ");
	            firstName = sc.next();
	            
	        }

	        System.out.println("Enter Your Last Name");
	        String lastName = sc.next();
	        try {
	            validateLastName.ValidateLastName(lastName);
	        } catch (ValidateException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Enter Your Email Address");
	        String email = sc.next();
	        try {
	            validateEmail.ValidateEmail(email);
	        } catch (ValidateException e) {
	            e.printStackTrace();
	            
	        }

	        System.out.println("Enter Your Mobile Number");
	        String phoneNumber = sc.next();
	        try {
	        	validatePhoneNumber.ValidatePhoneNumber(phoneNumber);
	        } catch (ValidateException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Enter Your Password");
	        String password = sc.next();
	        try {
	            validatePassword.ValidatePassword(password);
	        } catch (ValidateException e) {
	            e.printStackTrace();
	        }

	      System.out.println("you have completed the all the test");


	        }

	
}}