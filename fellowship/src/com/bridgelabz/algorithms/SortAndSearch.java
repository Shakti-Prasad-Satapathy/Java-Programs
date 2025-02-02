package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class SortAndSearch {
	
	public static long[] time=new long[6];

		public static void main(String args[]){  
			Utility obj= new Utility();
		        int arr[] = {3,60,35,2,45,320,5};
		        
		        obj.bubbleSort4int(arr);
		        
		        obj.insertionSort4int(arr);
		        
		        Arrays.sort(arr);
		        int key = 35;    
		        obj.binarySearch4int(arr,key);  
		        
		        String str[] = { "bollo", "cat", "how", "dog", "you"};
		        
		        obj.bubbleSort4str(str);
		        
		        obj.insertionSort4str(str);
		        
		        Arrays.sort(str);
		        String skey="dogs";
		        obj.binarySearch4str(str,skey);
		        
		        Arrays.sort(time);
		        
		        long temp=0;
		        for (int i = 0; i < time.length; i++)  {
		            for (int j = i + 1; j < time.length; j++) {
		                if (time[i] < time[j]) {
		                    temp = time[i];
		                    time[i] = time[j];
		                    time[j] = temp;
		                }
		            }
		        }
		        String s1=Arrays.toString(time);
		        System.out.print(s1+"**************************************** ");
		 }  
		}  