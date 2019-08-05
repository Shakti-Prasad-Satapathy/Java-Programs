
package com.bridgelabz.algorithms;
import java. util.*;

import com.bridgelabz.utility.Utility;
public class BinaryNibbles {

    public static void main(String[] args){
    	Utility obj= new Utility();
    	Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        int n = s.nextInt();
        obj.toBinary(n);
        
    }
}

