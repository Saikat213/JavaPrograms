package advanceConcepts;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private final String emailPattern = "^[a-z]{1}[a-z0-9+-._]+@[a-z.]+\\.[a-z]{2,4}";
	private final String fnamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private final String lnamePattern = "^[A-Z]{1}[a-z]{2,}$";
	private final String phnPattern = "^[1-9]{2,}[1-9][0-9]{9}$";
	private final String passwd = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$_]{1}).{8,}";
	
	void checkPattern(String input, String inputPattern) {
		Pattern pattern = Pattern.compile(inputPattern);
		Matcher matcher = pattern.matcher(input); 
		System.out.println(matcher.find());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserRegistration userreg = new UserRegistration();
		
		System.out.println("Enter First name of user: ");
		String fname = scanner.next();
		userreg.checkPattern(fname, userreg.fnamePattern);
		
		System.out.println("Enter Last name of user: ");
		String lname = scanner.next();
		userreg.checkPattern(lname, userreg.lnamePattern);
		
		System.out.println("Enter email of user: ");
		String email = scanner.next();
		userreg.checkPattern(email, userreg.emailPattern);
		
		System.out.println("Enter phn of user: ");
		String phn = scanner.next();
		userreg.checkPattern(phn, userreg.phnPattern);
		
		System.out.println("Enter password of user: ");
		String pass = scanner.next();
		userreg.checkPattern(pass, userreg.passwd);
		scanner.close();
	}
}
