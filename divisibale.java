package com.tka.dec;

public class divisibale {
	public static void main(String[] args) {
		int num = 28;
		
		if(num % 3 == 0) {
			System.out.println("FIZZ");
			
		}else if(num % 5 == 0) {
			System.out.println("BUZZ");
		}else if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("FIZZBUZZ");
			
		}else {
			System.out.println("This number is not Divisible");
		}
		
	}

}
