package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

public class UseCase6 {
	public static  String groupName;
	public static HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	
	@BeforeClass
	public static void createGroup() {
		groupName = "Georgie's Pantry";
		ArrayList<String> groupUsers = new ArrayList<String>();
		groupUsers.add("Lily");
		groupUsers.add("Johnathan");
		groupUsers.add("Nathan");
		groupUsers.add("Karson");
		map.put(groupName, groupUsers);
	}
	
	@Test
	public void name() {
		Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
		Matcher matches = p.matcher(groupName);
		boolean containsSpecial = matches.find();
		assertEquals(false, containsSpecial);
	}
	
	@Test
	public void members() {
		assertTrue(map.get(groupName).size() >= 2);
		assertTrue(map.get(groupName).size() <= 9);
	}
}
