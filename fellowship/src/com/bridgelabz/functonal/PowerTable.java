package com.bridgelabz.functonal;
import java.util.Scanner;
public class PowerTable{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = s.nextInt();
		int i=0;
		int power = 1;
		System.out.println("the power of 2"+n);
		while(i<=n){
			System.out.println("2^"+i+"="+power);
			power = power*2;
			i++;
		}
	}
}
