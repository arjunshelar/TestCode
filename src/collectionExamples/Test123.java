package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test123 {
    public static void main(String[] args) {
    	String ss = "12 14";
    	String[] sd = ss.split(" ");
    	for(String s: sd)
    	{
    		System.out.println(s);
    		System.out.println("int i = " + Integer.parseInt(s));
    	}
    	 
        try
        {
          // the String to int conversion happens here
          int i = Integer.parseInt(sd[0].trim());
     
          // print out the value after the conversion
          System.out.println("int i = " + i);
          
        }
        catch (NumberFormatException nfe)
        {
          System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    	
    	String s ="Arjun 1arjun";
    	
    	
    	char[] c = s.toCharArray();
    	
    	if(s.chars().allMatch(Character::isLetter))
    		System.out.println("its a pure stirng");
		
		/*for(Character ch: c) {
			if(ch.isLetter(ch))
				System.out.println(ch);
		}*/
		
		for(char op : c) {
			if(Character.isLetter(op))
				System.out.println(op);
			else
				System.out.println("Not pure string  "+ op);
	}
    	
    	
		
		
		
		
    }
}