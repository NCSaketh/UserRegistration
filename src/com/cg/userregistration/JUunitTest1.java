package com.cg.userregistration;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class JUunitTest1 {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnInvalidDetailsException() {

		boolean result = UserRegistration.ValidFirstName("Sak");
		assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws InvalidDetailsException {

		UserRegistration.ValidFirstName("Sa");	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.ValidLastName("Sak");
		assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotValid_ShouldReturnInvalidDetailsException() throws InvalidDetailsException {
		UserRegistration.ValidLastName("Sa");
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() throws InvalidDetailsException {
		boolean result = UserRegistration.validEmailID("awes@gmail.com");
		assertEquals(true, result);
	}
	
	@Test
	public void givenEmail_WheNotValid_ShouldReturnInvalidDetailsException() {
		boolean result;
		try {
			result = UserRegistration.validEmailID("a@gmail.com");
		} catch (InvalidDetailsException e) {
			// TODO Auto-generated catch block
			assertEquals(false, e.getMessage());
		}
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.validMobileNo("91 8209333509");
		assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNo_WhenNotValid_ShouldReturnInvalidDetailsException() throws InvalidDetailsException {
		
		 UserRegistration.validMobileNo("91 82093");
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.validPassword("Abc3%xyz");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenNotValid_ShouldReturnInvalidDetailsException() throws InvalidDetailsException {
		UserRegistration.validPassword("3%xyz");
	}

}
