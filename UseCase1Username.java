package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.Test;

public class UseCase1Username {
	//creates a global variable that is the username
	public static HashMap<String,String> map = new HashMap<String, String>();
	public static String userN;
	public static String userP;
	public void stuff() {
		//preloading some accounts into the hashmap for testing
		map.put("JohnDoe", "HappyDay$");
		map.put("JaneDoe", "tim3$79");
		map.put("MindGoblin", "Hehe#YeahBoi");
		//this takes in the username and password
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Please enter your account UserName");
		userN = UserInput.nextLine();
		System.out.println("Please enter your account Password");
		userP = UserInput.nextLine();
	}
	
	@Test
	public void userName() {
		stuff();
		assertTrue(map.containsKey(userN));
	}
	
	@Test
	public void password() {
		assertEquals(map.get(userN), userP);
	}
}
