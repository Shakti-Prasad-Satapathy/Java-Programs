package com.bridgelabz.functonal;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int temp=0, r=0, sum=0;
	    System.out.print("Enter  the number to check : ");
	    int num = obj.nextInt();
	    temp=num;
  	  while(num>0){    
  	   r=num%10;  
  	   sum=(sum*10)+r;    
  	   num=num/10;    
  	  }    
  	  if(temp==sum)  {  
  	   System.out.println(temp+" is palindrome "); 
  	  }
     else
    	 System.out.println(temp+" is not palindrome ");
  
	}

}
