package com.bridgeuserregistration;
import com.bridgeuserregistration.ICommonInterface.*;

import java.util.Scanner;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	 //Validate First Name using Lambda Function
    public static ValidateFirstName validateFirstName = (String firstName) ->{
    	String userFirstName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(userFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if(matcher.find()) {
                return true;
            }else {
                throw new ValidateException("Enter Valid First Name ");
            }        
    };
 

//    Validate last Name using Lambda Function
    public static ValidateLastName validateLastName = (String lastName) ->{
    	String userLastName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(userLastName);
        Matcher matcher = pattern.matcher(lastName);
        if(matcher.find()) {
            return true;
        }else {
            throw new ValidateException("Enter Valid last Name ");
        }       
};

    //Validate Email using Lambda Function
    public static ValidateEmail validateEmail = (String email) ->{
    	String userEmail = "^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";
        Pattern pattern = Pattern.compile(userEmail);
        Matcher matcher = pattern.matcher(email);
        if(matcher.find()) {
            return true;
        }else {
            throw new ValidateException("Enter Valid email id ");
        }
    };

//    Validate MobileNumber using Lambda Function
    public static ValidatePhoneNumber validatePhoneNumber = (String phoneNumber) ->{
    	String phoneNumbe = "^(91)?[7-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.find()) {
            return true;
        }else {
            throw new ValidateException("Enter Valid phone number ");
        }
    };

//   Validate Password using Lambda Function
    public static ValidatePassword validatePassword = (String password) ->{
    	String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";
        Pattern pattern = Pattern.compile(userPassword);
        Matcher matcher = pattern.matcher(password);
        if(matcher.find()) {
            return true;
        }else {
            throw new ValidateException("Enter Valid password ");
        }
};		
}
	
