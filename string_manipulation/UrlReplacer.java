package com.string;

import java.util.Scanner;

/*Create a Java Program that displays output to system console. 
It asks user for a number goes to url replaces "1" with user number and returns result to system console.*/

public class UrlReplacer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int userNum = scanner.nextInt() ;
		String url = "http:localhost/3306/page1" ;
		String replaceURL = url.replace("1", String.valueOf(userNum)) ;
		System.out.println(replaceURL);
		scanner.close();

	}

}
