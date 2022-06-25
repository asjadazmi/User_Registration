package com.bridgeuserregistration;

public class ICommonInterface {
	@FunctionalInterface
	public interface ValidateFirstName {
	    public boolean validateFirstName(String firstName) throws ValidateException;
	}
	@FunctionalInterface
	public interface ValidateLastName {
	    public boolean ValidateLastName(String lastName) throws ValidateException;
	}
	@FunctionalInterface
	public interface ValidateEmail {
	    public boolean ValidateEmail(String email) throws ValidateException;
	}
	@FunctionalInterface
	public interface ValidatePhoneNumber {
	    public boolean ValidatePhoneNumber(String phoneNumber) throws ValidateException;
	}
	@FunctionalInterface
	public interface ValidatePassword {
	    public boolean ValidatePassword(String password) throws ValidateException;
	}

}
