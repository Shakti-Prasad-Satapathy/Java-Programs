package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class Anagram {
	public static void main(String[] args){
		Utility obj= new Utility();
	    String str1, str2;
	   
	    
	    Scanner str = new Scanner(System.in);
	        
	    System.out.print("Enter First String : ");
	    str1 = str.nextLine();
	    System.out.print("Enter Second String : ");
	    str2 = str.nextLine();
	    obj.anagram(str1, str2);
	    
	        
	    }
}
	