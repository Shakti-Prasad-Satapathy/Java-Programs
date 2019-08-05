
package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class TemperaturConversion {

	public static void main(String[] args) {
		Utility obj=new Utility();
	
		// TODO Auto-generated method stub
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the temperatur in Celsius");
		int c=obj1.nextInt();
		System.out.println("Enter the temperatur in Fahrenheit");
		int f=obj1.nextInt();
		obj.Tempreturechange(c,f);
	
	}

}
