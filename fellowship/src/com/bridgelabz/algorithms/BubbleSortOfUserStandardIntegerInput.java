package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSortOfUserStandardIntegerInput {
	
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		Utility util=new Utility();
		// TODO Auto-generated method stub
		System.out.println("Please Enter the number of words you wants to Enter");
		int tempn=obj. nextInt();
		int arr[]= new int[tempn];
		for (int i=0;i<tempn;i++) {
			arr[i]= obj.nextInt();
		}
		util.bubbleSortByUserInput(arr);
		}

}
