package com.string;

/*Write a program to display 100 lines of output to system console.  Lines will be made up of: 
(1) If line number evenly divisible by 2 line should say "FIZZ", 
(2) If line number evenly divisible by 3 line should say "BUZZ", 
(3) If line number evenly divisible by 2 AND 3 line should say "FIZZBUZZ" only.
(4) If no other conditions line should be blank.
*/
public class FizzBuzz {

	public static void main(String[] args) {
		
		final int lines = 100 ;
		
		for (int i=1 ; i<=lines; i++ ) {
			if(i%2 == 0 && i%3 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 2 == 0 ) {
				System.out.println("FIZZ");
			} else if (i % 3 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println();
			}
		}

	}

}
