package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.algorithms.*;
public class Utility {
	private static final String Intiger = null;
	public void anagram(String str1, String str2) {
		boolean status=true;
	 if(str1.length()==str2.length()) {
	    	char[] ArrayS1 = str1.toLowerCase().toCharArray();  
	    	char[] ArrayS2 = str2.toLowerCase().toCharArray();  
	    	Arrays.sort(ArrayS1);  
	    	Arrays.sort(ArrayS2);  
	    	status = Arrays.equals(ArrayS1, ArrayS2);  
	    	if (status) {  
	    		System.out.println(str1 + " and " + str2 + " are anagrams");  
	    	} 
	    	else 
	    	{  
	    		System.out.println(str1 + " and " + str2 + " are not anagrams");  
	    	} 
	    }
	    else {
	            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
	        }
	}
	
	/********************************************************************************************/
	
	public void checkPrime(int n) {
		int flag = 0;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				// System.out.println(n+" is not prime number");
				flag = 1;
				break;
			}
		}

			if (flag == 0) {
				palindrome(n);
			}
		
	}
	
	/********************************************************************************************************/
	
	public void palindrome(int prim) {
		int temp = 0, r, sum = 0;
		temp = prim;
		while (temp > 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}
		if (prim == sum) 
		{
			System.out.println(sum+"this number is both prime and paliondrome");
		//	return false;
			//result=1;
			PrimeAndPalindrome.nos.add(sum);
		}	
	}
	/********************************************************************************************/
	public void anagram(ArrayList<Integer> nos) {
		boolean status=true;
		int x=0, y=0, count=0;
		for (int i = 0; i < nos.size(); i++) {
			for (int j = i+1; j < nos.size(); j++) {
				 x=nos.get(i);
				 y=nos.get(j);
				 String s1=Integer.toString(x);
				 String s2=Integer.toString(y);
			if(s1.length()==s2.length()) {
			int a[]=new int[3];
			a[0]=x%10;
			x=x/10;
			a[1]=x%10;
			x=x/10;
			a[2]=x%10;
			
			
			int b[]=new int[3];
			b[0]=y%10;
			y=y/10;
			b[1]=y%10;
			y=y/10;
			b[2]=y%10;
			Arrays.sort(a);
			Arrays.sort(b);
			status = Arrays.equals(a, b);
			if (status) {  
	   		System.out.println(x + " and " + y + " are anagrams");  
	   		count++;
	   		} 
			}else
				System.out.println("result not found");
			}
		}
		
		if(count>0) {System.out.println("result not found");}

				
 	}
		
	/*********************************************************************************************/
	
	/*********Searching element in integer array using Binary search****************/
	public static void binarySearch4int(int arr[], int key){  
		 long startTime = System.nanoTime();
		int first = 0, last = arr.length - 1; 
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   } 
		   long stopTime = System.nanoTime();
		      long elapsedTime = stopTime - startTime;
		      System.out.println("**********************************************"+elapsedTime);
		      SortAndSearch.time[0]=elapsedTime;
		 }  
	/*****************************************************************************************************/
	/*********Sorting elements in integer array using Bubble Sort ****************/
	public static void bubbleSort4int(int[] arr) {  
		long startTime = System.nanoTime();
       int n = arr.length;  
       int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                         if(arr[j-1] > arr[j]){  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
        }  
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("*************************************************"+elapsedTime);
	      SortAndSearch.time[1]=elapsedTime;
 
   }  
	
	/*******************************************************************************************************/
	/*********Sorting elements in integer array using Insertion Sort ****************/
	public static void insertionSort4int(int array[]) {  
		long startTime = System.nanoTime();
       int n = array.length;  
       for (int j = 1; j < n; j++) {  
           int key = array[j];  
           int i = j-1;  
           while ( (i > -1) && ( array [i] > key ) ) {  
               array [i+1] = array [i];  
               i--;  
           }  
           array[i+1] = key;  
       }
       System.out.println("After Insertion Sort");    
       for(int i=0; i < array.length; i++){     
           System.out.print(array[i] + " "); 
       }
       System.out.println();
       long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("******************************************"+elapsedTime);
	      SortAndSearch.time[2]=elapsedTime;
   }  
	
	/*************************************************************************************************/
	/*********Sorting elements in String array using Bubble Sort ****************/
	public static void bubbleSort4str(String[] arrs) {
		long startTime = System.nanoTime();
	 String temp="";
    System.out.println("Sorted string...");
    for (int j = 0; j < arrs.length; j++) {
       for (int i = j + 1; i < arrs.length; i++) {
          // comparing strings
          if (arrs[i].compareTo(arrs[j]) < 0) {
             temp = arrs[j];
             arrs[j] = arrs[i];
             arrs[i] = temp;
          }
       }
       
    }
    System.out.println("Array After Bubble Sort");  
    for(int i=0; i < arrs.length; i++){  
            System.out.print(arrs[i] + " ");  
    }  
    System.out.println();
    long stopTime = System.nanoTime();
    long elapsedTime = stopTime - startTime;
    System.out.println("**********************************************"+elapsedTime);
    SortAndSearch.time[3]=elapsedTime;
    }
    
    /***************************************************************************************************/
	
	/*********Sorting elements in String array using Insertion Sort ****************/
	public static void insertionSort4str(String array[]) { 
		long startTime = System.nanoTime();
		int i,j;
		  String key;
		  for (j = 1; j < array.length; j++) { //the condition has changed
		    key = array[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(array[i]) > 0) {//here too
		        break;
		      }
		      array[i + 1] = array[i];
		      i--;
		    }
		  }
		  System.out.println("After Insertion Sort"+Arrays.toString(array));
		  long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("********************************************"+elapsedTime);
	      SortAndSearch.time[4]=elapsedTime;
	}
	
	/**********************************************************************************/
	
	public static void binarySearch4str(String[] arr, String x) {
		long startTime = System.nanoTime();
       int left = 0, right = arr.length - 1; int m=0;
       while (left <= right) { 
            m = left + (right - left) / 2; 
           
           int res = x.compareTo(arr[m]); 
          
           // Check if x is present at mid 
           if (res == 0) 
           	System.out.println("Element is found at index: " + m);
 
           // If x greater, ignore left half 
           if (res > 0) 
           	left = m + 1; 
           	 
 
           // If x is smaller, ignore right half 
           else
           	right = m - 1; 
       } 

       if ( left ==m || right==m ) 
		      System.out.println("Element is not found!"); 
       long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("*************************************************"+elapsedTime);
	      SortAndSearch.time[5]=elapsedTime;
   } 
	

/***************************************************************************************************/
	/********************************** I can read your mind/ Find Your number***********/
	public static void findno(int n) {
		Scanner obj= new Scanner(System.in);
		int count=1;
		double N=Math.pow(2, n);
		System.out.println(N);
		// TODO Auto-generated method stub
		int numarray[]=new int[(int) N];
		for (int i=1;i<N;i++) {
			numarray[i]=i;
		}
		System.out.println("Think of a number between 0 to"+N);
		int first = 0, last = numarray.length; 
		   int mid = (first + last)/2;  
		   while(count==1) {
		   System.out.println("press '1' if your number is between "+numarray[first]+" to "+numarray[mid]+" Else press '0'");
		   int check=obj.nextInt();
		   if(check==1) {
			   last=mid-1;
			   mid = (first + last)/2;
		   }
		   else {
		   first=mid+1;
		   mid = (first + last)/2;
		   }
		   if(first==mid || last==mid) {
			   System.out.println("press '1' if your number is between "+numarray[first]+" to "+numarray[first]+" Else press '0'");
			   check=obj.nextInt();
			   if(check==1)
			   System.out.println("Your choosen number is"+ first);
			   else
				   System.out.println("Your choosen number is"+ last);
			   count=0;
		   }
		   }
		}
	/**************************************************************************************************/
	
	
	/*******************enter standard String input and sort them using insertion sort*************/
	public static void insertionSortByUserInput(String array[]) { 
		long startTime = System.nanoTime();
		int i,j;
		  String key;
		  for (j = 1; j < array.length; j++) { //the condition has changed
		    key = array[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(array[i]) > 0) {//here too
		        break;
		      }
		      array[i + 1] = array[i];
		      i--;
		    }
		  }
		  System.out.println("After Insertion Sort"+Arrays.toString(array));
		  long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("********************************************"+elapsedTime);
	      SortAndSearch.time[4]=elapsedTime;
	}
	
	/***********************************************************************************************/
	
	/*********Sorting elements in user input integer array using Bubble Sort ****************/
	public static void bubbleSortByUserInput(int[] arr) {  
		long startTime = System.nanoTime();
       int n = arr.length;  
       int temp = 0;  
        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                         if(arr[j-1] > arr[j]){  
                                //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                         
                }  
        }  
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        long stopTime = System.nanoTime();
	      long elapsedTime = stopTime - startTime;
	      System.out.println("*************************************************"+elapsedTime);
	      SortAndSearch.time[1]=elapsedTime;
 
   } 
	
	/************************************************************************************************/
	/*********************** count the number of individual amount for change(chillar)***********************/
	public static void minimalchange(long amount) {
		int remender=0;
		int quotient=0;
		remender=(int) (amount%1000);
		quotient=(int) (amount/1000);
		System.out.println(quotient+" nos of 1000 rs");
		quotient=remender;
		
		remender=(int) (remender%500);
		quotient=(int) (quotient/500);
		System.out.println(quotient+" nos of 500 rs");
		quotient=remender;

		remender=(int) (remender%100);
		quotient=(int) (quotient/100);
		System.out.println(quotient+" nos of 100 rs");
		quotient=remender;
		
		remender=(int) (remender%50);
		quotient=(int) (quotient/50);
		System.out.println(quotient+" nos of 50 rs");
		quotient=remender;
		
		remender=(int) (remender%10);
		quotient=(int) (quotient/10);
		System.out.println(quotient+" nos of 10 rs");
		quotient=remender;
		
		remender=(int) (remender%5);
		quotient=(int) (quotient/5);
		System.out.println(quotient+" nos of 5 rs");
		quotient=remender;
		
		remender=(int) (remender%2);
		quotient=(int) (quotient/2);
		System.out.println(quotient+" nos of 2 rs");
		quotient=remender;
		
		System.out.println(quotient+" nos of 1 rs require");

	}
	
	/*****************************************************************************************************/
	
	public static void Tempreturechange(int c, int f) {
		f=(c * 9/5) + 32 ;
		System.out.println("Celsius in Fahrenheit="+f);
		c=(f - 32) * 5/9 ;
		System.out.println("Fahrenheit in Celsius="+c);

	}
	/*******************************************************************************************************/

	public static void payment(double P, double R, double Y) {
		// TODO Auto-generated method stub
		double n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow((1+r), (-n)));
		System.out.println("Total Payment is= "+payment);
		
	}
	
	/***********************************************************************************************/
	
/*********************************Conversion of Decimal to binary******************************************/
	
	public static void convert(int n) {
		int a;
        String x = "";
        
        while(n > 0){
            a = n % 2;
            
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
	}
	/********************************************************************************************************/
	
	/************************************Integer binary to decimal***********************************/
	public static void toBinary(int n) {
		int a;
        String x = "";
        
        while(n > 0){
            a = n % 2;
            
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x); 
        int y=Integer.parseInt(x);
        int[] binary=new int[8];
       
        for(int i=7;i>=0;i--) {
        	binary[i]=y%10;
        	y=y/10;
        }
 
        	String str= Arrays.toString(binary);
        	System.out.println(str);
        	int mid=4,first=0,last=4;
        	while(first<4) {
        		int temp= binary[first];
        		binary[first]=binary[last];
        		binary[last]=temp;
        		first++;last++;
        	}
        	String str1= Arrays.toString(binary);
        	System.out.println(str1);
        	//int newBnum=Intiger.parseInt(str1);
        	int tens=binary.length-1;int bi=0;
        	for(int i=0; i<8; i++) {
        		bi=bi+(int)(binary[i]*Math.pow(10, tens));
        		tens--;
        	}
        	System.out.println(bi);
        	int num = bi; 
            int dec_value = 0; 
          
            // Initializing base value to 1, i.e 2^0 
            int base = 1; 
          
            int temp = num; 
            while (temp>0) { 
                int last1 = temp % 10; 
                temp = temp / 10; 
                //last1=temp;
          
                dec_value =dec_value +( last1* base); 
          
                base = base * 2; 
            } 
          
            System.out.println(dec_value);        	 
	}
	/******************************************************************************************************/
	
	/************ A program to search word from a text file and display whether it is exist or not***************/
	 public static void words(String ipword){
		    String[] items = null;
		    int val = 0;
		  
		    try {
		        BufferedReader in = new BufferedReader(new FileReader("/home/admin1/Desktop/textfile/tf.txt"));
		        String str;
		        while ((str = in.readLine()) != null){
		        	//System.out.println(str);
		        	items = str.split("\\s*(=>|,.|\\s)");
		        	for(int i=0;i<items.length;i++) {
		        		
						//System.out.println(items[i]);
		        		if(ipword.equals(items[i])) 
				    		val=1;
				    	
		        	}
		        	 
		        }
		        if (val==0) 
	 		    	System.out.println("Result not found");
		        if (val==1) 
		    		System.out.println("word is exist");
		    	
	 		    
		        in.close();
		    } catch (IOException e) {
		    }
		    }
}