package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class VendingMachine {

	public static void main(String[] args) {
		Utility obj=new Utility();
	
		// TODO Auto-generated method stub
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the amount you wants to withdraw");
		long amount=obj1.nextInt();
		obj.minimalchange(amount);
	
	}

}
