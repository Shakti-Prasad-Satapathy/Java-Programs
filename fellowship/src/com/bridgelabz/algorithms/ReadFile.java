package com.bridgelabz.algorithms;
import java.io.*;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ReadFile {
	public static void main(String[] args) throws Exception { 
		Utility Utilityobj=new Utility();
		String ipword = ""; 
		    System.out.println("Enter the word to be searched for");
		    Scanner input = new Scanner(System.in);
		    ipword = input.nextLine();
		    Utilityobj.words(ipword);
		    
		   
	  } 
}
	
