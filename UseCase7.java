import static org.junit.Assert.*;
import java.util.*;
import java.util.regex.*;

import org.junit.*;

public class UseCase7 {
	public static String itemName;
	public static String numItem;
	public static ArrayList<String[]> shoppingList = new ArrayList<String[]>();
	
	
	public static void addItem()
	{
		  Scanner Input = new Scanner(System.in);
	  	System.out.println("Enter the item name: ");
		  itemName = Input.nextLine();
	  	System.out.println("Enter the item amount: ");
		  numItem = Input.nextLine();
		
		  String[] item = {itemName, numItem};
		  shoppingList.add(item);
		
		  Input.close();
	}
	
	@Test
	public void name() {
		  Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
		  Matcher matches = p.matcher(itemName);
		  boolean containsSpecial = matches.find();
		  assertEquals(false, containsSpecial);
	}

	@Test
	public void amount() {
		  assertTrue((Integer.parseInt(numItem)) > 0);
		  assertTrue(Integer.parseInt(numItem) <= 10);
	}
	
}
