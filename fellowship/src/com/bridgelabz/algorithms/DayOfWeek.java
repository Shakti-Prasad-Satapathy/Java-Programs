package com.bridgelabz.algorithms;

public class DayOfWeek {
		public static int dayOfWeek(int y,int m,int d) {

		       int y0 = y -(14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31*m0 / 12) % 7;
		return d0;
		}
		public static void main(String[] args) {
		String[] str= {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int day=dayOfWeek(y, m, d);
		for(int i=0;i<7;i++)
		{
		if(day==i) {
		System.out.println("day is "+str[i]);
		break;
		}

		}

		}
		

}
