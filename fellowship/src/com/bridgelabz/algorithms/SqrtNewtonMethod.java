package com.bridgelabz.algorithms;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class SqrtNewtonMethod {
    public static void main(String[] args) {
    	Scanner obj= new Scanner (System.in);
    	System.out.println("Enter the square number to find its square root");
        double c = obj.nextDouble();

        double epsilon = 1e-15;    
        double t = c;              
        
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
