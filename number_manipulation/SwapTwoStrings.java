package com.coding;

import java.util.Scanner;
 
public class SwapTwoStrings 
{  
    public static void main(String[] args) 
    {   
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First String :");
//        String s1 = sc.next();
//        System.out.println("Enter Second String :");
//        String s2 = sc.next();
//        System.out.println("Before Swapping :");
//        System.out.println("s1 : "+s1);
//        System.out.println("s2 : "+s2);
    	
    	String s1 = "JAVA" ;
    	String s2 = "J2EE" ;
         
        //Swapping starts
        s1 = s1 + s2;         //             "JAVAJ2EE"
        s2 = s1.substring(0, s1.length()-s2.length());  // JAVA
        s1 = s1.substring(s2.length());  // J2EE
         
        //Swapping ends
        System.out.println("After Swapping :");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
    }   
}
