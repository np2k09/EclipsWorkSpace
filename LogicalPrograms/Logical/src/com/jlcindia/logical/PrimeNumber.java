package com.jlcindia.logical;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 17;
		boolean b = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0){
				System.out.println("this is not prime number");
				break;
			}
		}
	}

}
