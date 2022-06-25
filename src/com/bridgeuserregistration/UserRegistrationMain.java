package com.bridgeuserregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) throws ValidateException {

        System.out.println("Welcome to the Exception problem");
        UserRegistration v = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String first_name = sc.next();
        try {
            v.firstNameValidation(first_name);
        }
        catch (ValidateException e)
        {
            System.out.println(e);
            System.out.println("Please enter first name: ");
            first_name = sc.next();
        }
        
        System.out.println("Please enter last name  : ");
        String last_name = sc.next();
        try {
            v.lastNameValidation(last_name);
        }
        catch (ValidateException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter last name: ");
            last_name = sc.next();
        }
        System.out.println("Please enter email: ");
        String email = sc.next();
        try {
            v.emailValidation(email);
        }
        catch (ValidateException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter last email: ");
            last_name = sc.next();
        }
        System.out.println("Please enter mobile number: ");
        String number = sc.next();
        try {
            v.mobileValidation(number);
        }
        catch (ValidateException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter mobile number: ");
            last_name = sc.next();
        }
        System.out.println("Please enter password: ");
        String password = sc.next();
        try {
            v.passwordValidation(password);
        }
        catch (ValidateException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Please enter password: ");
            last_name = sc.next();
        }
       System.out.println(" all test done finally");
       

}

	
}