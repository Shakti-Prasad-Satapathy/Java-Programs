package com.bridgelabz.functonal;
public class DistanceOfPoints {
	public static void main(String arg[]) {
		int x=0,y=0,x1,y1;
		x1=Integer.parseInt(arg[0]);
        y1=Integer.parseInt(arg[1]);
 
	     double dis=Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1),2));
	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x+","+y+")= "+dis);
	}
}