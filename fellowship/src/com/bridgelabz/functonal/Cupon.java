package com.bridgelabz.functonal;
import java.util.*;  
class Cupon{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
	 int loop=5, count=0;
	 Scanner obj= new Scanner(System.in);
	 System.out.println("Enter the number of cupon you want");
	 int num= obj.nextInt();
	 
    HashSet<Integer> set=new HashSet<Integer>();  
    while(loop==5) {
    	Random rand = new Random(); 
    	int ran = rand.nextInt(1000); 
    	count++;
           set.add(ran); 
           if(set.size()==num)
        	   loop=8;
    }
           
      System.out.println("took "+count+" times to get " +num + " cupons");     
 }  
}  

