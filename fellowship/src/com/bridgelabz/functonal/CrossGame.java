package com.bridgelabz.functonal;

import java.util.Random;
import java.util.Scanner;

public class CrossGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner(System.in);
		int a=1;
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=a;
				a++;	
			}
		}
		int counter=1;
		while(counter<10) {
			if(counter%2==0) {
				System.out.println("Enter the position You wants to cross");
				System.out.print("i1= ");
				int user_i=obj.nextInt();
				System.out.print("j1= ");
				int user_j=obj.nextInt();
				if(user_j<0 || user_j>2 || user_i<0 || user_i>2 || arr[user_i][user_j]==0 || arr[user_i][user_j]==-1) 
					System.out.println("Enter another position You wants to cross");
				else
					arr[user_i][user_j]=0;	
				counter++;
			}
			else {
				
				Random rand = new Random(); 
				int System_i = rand.nextInt(3);
				int System_j = rand.nextInt(3);
				
				if(arr[System_i][System_j]>0) {
					arr[System_i][System_j]=-1;	
					System.out.print("i1= "+System_i+"  ");
					System.out.println("j1= "+System_j);
					counter++;
					
				}
				}
			}
		
		if(		arr[0][0]==0 && arr[0][1]==0 &&arr[0][2]==0 || arr[0][0]==0 && arr[1][0]==0 && arr[2][0]==0 || 
				arr[2][0]==0 && arr[2][1]==0 && arr[2][2]==0 || arr[0][2]==0 && arr[1][2]==0 && arr[2][2]==0 ||
				arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0 || arr[2][0]==0 && arr[1][1]==0 && arr[0][2]==0) {
			System.out.println("CONGRATS!!! YPU HAVE WON");
		}

		if(		arr[0][0]==1 && arr[0][1]==1 &&arr[0][2]==1 || arr[0][0]==1 && arr[1][0]==1 && arr[2][0]==1 || 
				arr[2][0]==1 && arr[2][1]==1 && arr[2][2]==1 || arr[0][2]==1 && arr[1][2]==1 && arr[2][2]==1 ||
				arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1 || arr[2][0]==1 && arr[1][1]==1 && arr[0][2]==1) {
			System.out.println("SORRY YOU HAVE LOSE>>> BETER LUCK NEXT TIME");
		}
			
	}

}
