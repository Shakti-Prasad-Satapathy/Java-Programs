package com.bridgelabz.functonal;

public class pandp {
	static int prim = 0;

	public static void checkPrime(int n) {
		System.out.println("hii");
		int i, flag = 0;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				// System.out.println(n+" is not prime number");
				flag = 1;
				break;
			}

			if (flag == 0) {
				
				prim = n;
			}
		}
		System.out.println("it is a prime number"+prim);
		pandp.palindrome(prim);
	}

	// }
	public static void palindrome(int prim) {
		System.out.println("hii");
		int temp = 0, r, sum = 0;
		temp = prim;
		while (temp > 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}
		if (prim == sum) {
			System.out.println(prim + " is palindrome and prime ");
		}

	}

	public static void main(String args[]) {
		System.out.println("hii");
		// checkPrime(1);
		// checkPrime(3);
		checkPrime(191);

	}

}
