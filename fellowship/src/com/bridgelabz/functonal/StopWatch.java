package com.bridgelabz.functonal;

import java.util.Scanner;
 
public class StopWatch {
 
  public static void main(String[] args) {
	  Scanner obj=new Scanner (System.in);
	  
	  System.out.println("press any number to Start and anothger number for stop the stopwatch");
	  int a=obj.nextInt();
	  long startTime = System.nanoTime();
	  a=obj.nextInt();
	  long stopTime = System.nanoTime();
      long elapsedTime = stopTime - startTime;
      System.out.println("********************************************"+elapsedTime);
	  
  }
}