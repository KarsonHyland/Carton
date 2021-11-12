package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class UseCases4 {
	//creates a global variable that is the username
		public static ArrayList<String[]> PantryList = new ArrayList<String[]>();
		public void stuff() {
			//this takes in the username and password
			Scanner UserInput = new Scanner(System.in);
			System.out.println("Please enter the Item name, quantity, and experation date (in xx/xx format, day and then month) of the item you would like to add to your pantry.");
			String ItemName = UserInput.nextLine();
			int ItemQuantity = UserInput.nextInt();
			UserInput.nextLine();
			String ExperationDate = UserInput.nextLine();
			String[] Item = {ItemName, ExperationDate, String.valueOf(ItemQuantity)};
			PantryList.add(Item);
		}
		
		@Test
		public void TestA_ItemName() {
			assertTrue(PantryList.get(0)[0].indexOf(" ") == -1);
			assertTrue(PantryList.get(0)[0].length() < 100);
		}
		
		@Test
		public void TestB_Quantity() {
			stuff();
			assertTrue(Integer.parseInt(PantryList.get(0)[2]) < 50);
			assertTrue(Integer.parseInt(PantryList.get(0)[2]) > 0);
		}
		
		@Test
		public void Testc_ExperationDate() {
			assertTrue(PantryList.get(0)[1].contains("/"));
			assertTrue(PantryList.get(0)[1].length() == 5);
		}

}
