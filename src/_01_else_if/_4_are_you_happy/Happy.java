package _01_else_if._4_are_you_happy;
import java.util.Random;

import javax.swing.JOptionPane;

public class Happy {

	public static void main(String[] args)
	{
		//(What type?) happy = "";
		//is it a String? an Integer? 
		
	    String happy = JOptionPane.showInputDialog("are you happy");
	    
	    //Use of the new keyword vs static literal creations.
	    String house1 = new String("bob");
	    String house2 = "sue";
	    String house3 = "bob";
	    
	    //With literal string creation.
	    //sue -> 8a94c2dc489ab87ee6f42020a3924c11
		//bob -> 9f9d51bc70ef21ca5c14f307980a29d8 -> new String("Bob") -> StringObject1
	    
	    String var1 = "bob"; //9f9d51bc70ef21ca5c14f307980a29d8 -> StringObject1
	    String var2 = "bob"; //9f9d51bc70ef21ca5c14f307980a29d8 -> StringObject1
	    String var3 = new String("bob"); //9f9d51bc70ef21ca5c14f307980a29p4 -> StringObject2
	    
	    //They are the same object because Java has compiler optimizations.
	    //var1 == var2 -> true Because they are the same object.
	    //var1 == var3 -> false Because they are different physical objects to the java compiler.
	    //var1.equals(var3) -> true
	    
	    /*
	     * Talk a bit more about object comparison
	     * vs String value comparisons. 
	     * 
	     * Explain a little bit about how java represents
	     * Strings under the covers.
	     */
	    
	    if (house1 == house3) //This is false
	    {
	    	System.out.println("TRUE");
	    	
	    } else {
	    	
	    	System.out.println("FALSE");
	    	System.out.println(happy);
	    }
	    
	    //happy == "no" -> evaluates to false.
	    if (happy.equals("no")) {
	    	 
	    	/*
	    	 * Common mistake when comparing strings.
	    	 * String value == "value" does an object comparison.
	    	 * It doesn't do a value comparison.
	    	 * 
	    	 *  String happy which has a value of 'no' is one object.
	    	 *  The literal "no" string is a different object.
	    	 *  
	    	 *  so Object1 == Object2 is false.
	    	 *  
	    	 *  Oddly enough "no" == "no" should return true.
	    	 *  
	    	 */
	        JOptionPane.showInputDialog("Do you want to be happy?");
	
	    } else {
	    	System.out.println("Happy value : " + happy);
	    }
	}
	
}
