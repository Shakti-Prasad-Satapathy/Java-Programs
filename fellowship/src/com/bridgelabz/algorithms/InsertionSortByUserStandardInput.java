package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.*;
public class InsertionSortByUserStandardInput {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		Utility util=new Utility();
		// TODO Auto-generated method stub
		System.out.println("Please Enter the number of words you wants to Enter");
		int tempn=obj. nextInt();
		String arr[]= new String[tempn];
		for (int i=0;i<tempn;i++) {
			arr[i]= obj.nextLine();
		}
		util.insertionSortByUserInput(arr);

	}

}
