import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.*;
import java.util.regex.*;

public class UseCase9 {

	public static String oldEmail;
	public static String newEmail;
	public static String verifyCode;
	
	public UseCase9() {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter your old email: ");
		oldEmail = input.nextLine();
		

		System.out.println("Enter your new email: ");
		newEmail = input.nextLine();
		
		System.out.println("Enter the verification code: ");
		verifyCode = input.nextLine();
		
		input.close();
	}
	
	@Test
	public void oldEmail() {
		Pattern p = Pattern.compile("@, .com", Pattern.CASE_INSENSITIVE);
		Matcher matches = p.matcher(oldEmail);
		boolean containsSpecial = oldEmail.contains("@");
		assertEquals(true, containsSpecial);
		assertFalse(oldEmail.indexOf(' ') != -1);
		assertTrue(oldEmail.length() >= 6);
	}
	
	public void newEmail() {
		Pattern p = Pattern.compile("@, .com", Pattern.CASE_INSENSITIVE);
		Matcher matches = p.matcher(newEmail);
		boolean containsSpecial = newEmail.contains("@");
		assertEquals(true, containsSpecial);
		assertFalse(newEmail.indexOf(' ') != -1);
		assertTrue(newEmail.length() >= 6);
	}
	
	public void verifyCode() {
		Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher matches = p.matcher(verifyCode);
		boolean containsSpecial = matches.find();
		assertEquals(true, containsSpecial);
		assertFalse(verifyCode.indexOf(' ') != -1);
		assertTrue(verifyCode.length() >= 6);
	}
	
}
