package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class monthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility obj=new Utility();
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the principal loan amount ");
		double P=obj1.nextDouble();
		System.out.println("Enter the interest per cent");
		double R=obj1.nextDouble();
		System.out.println("Enter the total years");
		double Y=obj1.nextDouble();
		obj.payment(P, R, Y);	
	}

}
