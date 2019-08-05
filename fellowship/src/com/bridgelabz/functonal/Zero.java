package com.bridgelabz.functonal;
import java.util.Scanner;
public class Zero {
	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter the number of intiger you want to enter");
		int n= obj.nextInt();
		System.out.println("Enter the intiger numbers you want to enter");
		int nos[]=new int[n];
		for(int i=0;i<n;i++) {
			nos[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(nos[i]!=nos[j] && nos[i]!=nos[k] &&nos[k]!=nos[j]) {
						int sum= nos[i]+nos[j]+nos[k];
						if(sum==0) {
							System.out.println("the 3 numbers are "+nos[i]+", "+nos[j]+", "+nos[k]);
						}
					}
					
				}
			}
		}
		

	}

}
