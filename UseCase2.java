package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class UseCase2 {
	//creates a global variable that is the username
		public static String userN = "";
		@Before
		public void before() {
			//this takes in the username
			Scanner UserInput = new Scanner(System.in);
			System.out.println("Please enter your account info");
			userN = UserInput.nextLine();
			//userP = UserInput.nextLine();
		}
		
		@Test
		public void userName() {
			//for the test we will be testing if the username and password are valid
			//to be valid the username must not contain a space and the password must not be shorter than 6 characters
			//this is testing if the username has a space or not
			//if it has a space then the assert false would work because the statement in the function would be true
			assertTrue(userN.indexOf(' ') == -1);
			//This will tell you if the username meets the minimum length
			//if it does the statement inside the function would be true and make this test valid
			assertTrue(userN.length() >= 4);
		}
		
		@Test
		public void password() {
			//for the test we will be testing if the username and password are valid
			//to be valid the username must not contain a space and the password must not be shorter than 6 characters
			//pattern creates a pattern for matcher to check through and see if the password entered contains a special character
			Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
			Matcher matches = p.matcher(userN);
			boolean containsSpecial = matches.find();
			//this is testing if the password is valid by containing special characters
			//If contains special is false then it did not and will not be valid
			assertEquals(true, containsSpecial);
			//this is testing if the username has a space or not
			//if it has a space then the assert false would work because the statement in the function would be true
			assertFalse(userN.indexOf(' ') != -1);
			//This will tell you if the username meets the minimum length
			//if it does the statement inside the function would be true and make this test valid
			assertTrue(userN.length() >= 6);
		}
		
		@Test
		public void email() {
			//for the test we will be testing if the username and password are valid
			//to be valid the username must not contain a space and the password must not be shorter than 6 characters
			//pattern creates a pattern for matcher to check through and see if the password entered contains a special character
			Pattern p = Pattern.compile("@, .com", Pattern.CASE_INSENSITIVE);
			Matcher matches = p.matcher(userN);
			boolean containsSpecial = userN.contains("@");
			//this is testing if the password is valid by containing special characters
			//If contains special is false then it did not and will not be valid
			assertEquals(true, containsSpecial);
			//this is testing if the username has a space or not
			//if it has a space then the assert false would work because the statement in the function would be true
			assertFalse(userN.indexOf(' ') != -1);
			//This will tell you if the username meets the minimum length
			//if it does the statement inside the function would be true and make this test valid
			assertTrue(userN.length() >= 6);
		}
		@Test
		public void Veri() {
			//This will tell you if the username meets the minimum length
			//if it does the statement inside the function would be true and make this test valid
			assertEquals(userN, "TVRP");
		}
}
