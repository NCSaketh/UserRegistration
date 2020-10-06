package com.cg.userregistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JUnitTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {

		boolean result = UserRegistration.ValidFirstName("Sak");
		assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {

		boolean result = UserRegistration.ValidFirstName("Sa");
		assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.ValidLastName("Sak");
		assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotValid_ShouldReturnTrue() {
		boolean result = UserRegistration.ValidLastName("Sa");
		assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.validEmailID("awes@gmail.com");
		assertEquals(true, result);
	}
	
	@Test
	public void givenEmail_WheNotValid_ShouldReturnFalse() {
		boolean result = UserRegistration.validEmailID("a@gmail.com");
		assertEquals(false, result);
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.validMobileNo("91 8209333509");
		assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNo_WhenNotValid_ShouldReturnFalse() {
		boolean result = UserRegistration.validMobileNo("9 8209333");
		assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		boolean result = UserRegistration.validPassword("Abc3%xyz");
		assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenNotValid_ShouldReturnFalse() {
		boolean result = UserRegistration.validPassword("3%xyz");
		assertEquals(false, result);
	}

}
