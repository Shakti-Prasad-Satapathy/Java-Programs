
package com.bridgelabz.algorithms; 
import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class PrimeAndPalindrome {
	public static  ArrayList<Integer> nos = new ArrayList<>();

	
		 public static void main(String args[]){ 
			 Utility obj= new Utility();

			 for(int i = 2; i<=10000;i++){
				 obj.checkPrime(i);
			 }
			//System.out.println(nos.toString());
			obj.anagram(nos);
			 
		}    
}