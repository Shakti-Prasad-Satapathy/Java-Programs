package com.bridgelabz.functonal;
import java.io.PrintWriter;
import java.util.Scanner;

public class Two_D_Array {
	
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter row size");
	int m = s.nextInt();
	System.out.println("Enter column size");
	int n = s.nextInt();
	int[][] X = new int[m][n];
	double[][] Y = new double[m][n];
	boolean[][] Z = new boolean[m][n];
	X = Two_D_Array.intarray(m, n);
	Y = Two_D_Array.darray(m, n);
	Z = Two_D_Array.barray(m, n);
	Two_D_Array.display(X, Y, Z, m, n);

	}

	public static int[][] intarray(int m, int n) {
	Scanner s = new Scanner(System.in);
	int[][] A = new int[m][n];
	System.out.println("Enter the elements of integer array");
	for (int i = 0; i < m; i++) {

	for (int j = 0; j < n; j++) {

	A[i][j] = s.nextInt();
	}
	}
	return A;
	}

	public static double[][] darray(int m, int n) {
	Scanner s = new Scanner(System.in);
	double[][] B = new double[m][n];
	System.out.println("Enter the elements of double array");
	for (int i = 0; i < m; i++) {

	for (int j = 0; j < n; j++) {

	B[i][j] = s.nextDouble();
	}
	}
	return B;
	}

	public static boolean[][] barray(int m, int n) {
	Scanner s = new Scanner(System.in);
	boolean[][] C = new boolean[m][n];
	System.out.println("Enter the elements of boolean array");
	for (int i = 0; i < m; i++) {

	for (int j = 0; j < n; j++) {

	C[i][j] = s.nextBoolean();
	}
	}
	return C;
	}

	public static void display(int[][] A, double[][] B, boolean[][] C, int m, int n) {
	PrintWriter pw = new PrintWriter(System.out, true);

	pw.println("Displaying 2d int array");

	for (int i = 0; i < m; i++) {
	for (int j = 0; j < n; j++) {
	pw.print(A[i][j] + " ");
	}
	pw.println();
	}
	pw.println("Displaying 2d double array");

	for (int i = 0; i < m; i++) {
	for (int j = 0; j < n; j++) {
	pw.print(B[i][j] + " ");
	}
	pw.println();
	}
	pw.println("Displaying 2d boolean array");

	for (int i = 0; i < m; i++) {
	for (int j = 0; j < n; j++) {
	pw.print(C[i][j] + " ");
	}
	pw.println();
	}

	}

}
