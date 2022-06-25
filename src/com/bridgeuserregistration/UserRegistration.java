package com.bridgeuserregistration;

import java.util.Scanner;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//	FirstName
	public boolean firstNameValidation(String name) throws ValidateException{
			String firstNameRegex="^[A-Z]{1}[a-z]{2,}$";
			Pattern pattern=Pattern.compile(firstNameRegex);
			Matcher matcher=pattern.matcher(name);
			if(matcher.find()==false) {
				throw new ValidateException("please enter correct first name");
			}
			return matcher.find(); 
		}
//	LastName
	public boolean lastNameValidation(String name) throws  ValidateException {
		String lastNameRegex="^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern=Pattern.compile(lastNameRegex);
		Matcher matcher=pattern.matcher(name);
		if(matcher.find()==false) {
			throw new ValidateException("please enter correct last name");
		}
		return matcher.find();
		
	}
//	abc.xyz@bl.co.in
//	Email validation
	public boolean emailValidation(String email) throws ValidateException {
		String emailRegex="^[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?$";
		Pattern pattern=Pattern.compile(emailRegex);
		Matcher matcher=pattern.matcher(email);
		if(matcher.find()) {
			throw new ValidateException("please enter correct email");
		}
		return matcher.find();
	}
// 
//	Mobile Format
	public boolean mobileValidation(String mobile) throws ValidateException{
		String mobileRegex="^(91|0)?[7-9]{1}+[0-9]{9}$";
		Pattern pattern=Pattern.compile(mobileRegex);
		Matcher matcher=pattern.matcher(mobile);
		if(matcher.find()==false) {
			throw new ValidateException("please enter correct mobile number");
			
		}
		return matcher.find();
    }
//	password rule 
	public boolean passwordValidation(String password) throws ValidateException {
		String passwordRegex="^([A-Za-z0-9]*[//!//@//#//$//%//^//&//*//(//)//_//-//+//=//{//}//[//]//?//>//.//<//,//]*){8}$";
		Pattern pattern=Pattern.compile(passwordRegex);
		Matcher matcher=pattern.matcher(password);
		if(matcher.find()==false) {
			throw new ValidateException("please enter correct valid password");

		}
		return matcher.find();
}
}
	
