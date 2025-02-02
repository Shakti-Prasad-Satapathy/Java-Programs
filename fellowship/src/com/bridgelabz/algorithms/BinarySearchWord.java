package com.bridgelabz.algorithms;
import java.util.*;
public class BinarySearchWord {
	public static void main(String arg[]) {
		Scanner obj= new Scanner(System.in) ;
			String[] words = { "Books", "Pens", "Pencils", "Notebooks", "cat", "Dog" ,"School" };
		
		for (int i=0; i<words.length;i++) {
			words[i]=words[i].toLowerCase();
		}
		Arrays.sort(words);
		
		System.out.println("Enter the word you want to search");
		String str=obj.nextLine();
		int min = 0;
		int max = words.length - 1;
		int mid;
		while (min <= max) {
			mid = (min + max) / 2;
			if (words[mid].compareTo(str) < 0) { min = mid + 1; } else if (words[mid].compareTo(str) > 0) {
				System.out.println("word Found at ");
				max = mid - 1;
			} 
			else
				System.out.println("word Found not at ");
		}
		
	}

}
