package test;

import org.junit.Assert;
import org.junit.Test;

import advanceConcepts.UserRegistration;

public class TestCases {
	
	UserRegistration userReg = new UserRegistration();
	
	@Test
	public void happyTestCases() {
		Assert.assertEquals(true, userReg.checkPattern("Jayesh", "^[A-Z]{1}[a-z]{2,}$"));
		Assert.assertTrue(userReg.checkPattern("Khanna", "^[A-Z]{1}[a-z]{2,}$"));
		Assert.assertTrue(userReg.checkPattern("abc-12@yahoo.co.uk", "^[a-z]{1}[a-z0-9+-._]+@[a-z.]+\\.[a-z]{2,4}"));
		Assert.assertTrue(userReg.checkPattern("918798662345", "^[1-9]{2,}[1-9][0-9]{9}$"));
		Assert.assertTrue(userReg.checkPattern("rtQwer2@31", "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$_]{1}).{8,}"));
	}
	
	@Test
	public void sadTestCases() {
		Assert.assertTrue(userReg.checkPattern("raju", "^[A-Z]{1}[a-z]{2,}$"));
		Assert.assertTrue(userReg.checkPattern("malhotra", "^[A-Z]{1}[a-z]{2,}$"));
		Assert.assertTrue(userReg.checkPattern("hre@12.co.in", "^[a-z]{1}[a-z0-9+-._]+@[a-z.]+\\.[a-z]{2,4}"));
		Assert.assertTrue(userReg.checkPattern("14567890", "^[1-9]{2,}[1-9][0-9]{9}$"));
		Assert.assertTrue(userReg.checkPattern("tyh1@", "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$_]{1}).{8,}"));
	}
}
