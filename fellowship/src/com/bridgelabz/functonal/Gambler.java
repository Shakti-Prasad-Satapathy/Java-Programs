package com.bridgelabz.functonal;
import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner (System.in);
		System.out.println("Please Enter The amount you want to play");
		int stake= obj.nextInt();
		System.out.println("Please Enter The goal amount");
		int goal= obj.nextInt();
		System.out.println("Please Enter The Vatime you want to play");
		int trails= obj.nextInt();
		float  wins=0, loss=0;
		for(int i=0; i<trails;i++) {
			int cash=stake;
			while(cash>0 && cash<goal) {
			
				if(Math.random() <0.5) 
					cash++;
				else 
					cash--;
				if(cash==goal)
				wins++;
			}
		}
		System.out.println("Wins= "+wins);
		//System.out.println("loss= "+loss);
		System.out.println("Percentage of game owns="+(wins/trails)*100);
	
	
	}
}
