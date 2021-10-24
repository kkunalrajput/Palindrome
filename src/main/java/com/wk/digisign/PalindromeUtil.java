package com.wk.digisign;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * The class is used for checking if the a string is Palindrome or not.
 * @author Kunal.R
 *
 */
public class PalindromeUtil {

	public static void main(String[] args) {
		Scanner input = null;
		boolean exitProgram = Boolean.FALSE;
		try {
			System.out.println("Welcome user, this program checks if \nthe a given string is a Palindrome or not. ");
			
			while(true) {
				showHeaderMessage();
				input = new Scanner(System.in);
				
				if(input != null) {
					String inputString = input.nextLine();
			        
			        switch(inputString) {
			        case "1" :
			        	System.out.println("Please enter the string to be checked > ");		        	
			        	inputString = input.nextLine();
			        	if(inputString != null) {
			        		System.out.println("Is \'"+ inputString +"\' Palindrome : " + isPalindrome(inputString));
			        	} else {
			        		System.out.println("Invalid Input. Please try again.");
			        	}
			        	break;
			        case "2" :
			        	exitProgram = Boolean.TRUE;
			        	break;
		        	default:
		        		System.out.println("Invalid Input. Please try again.");
			        	break;
			        }
			        
			        //Exit the program when exitProgram is set true
			        if(exitProgram) {
			        	break;
			        }
				}
				
			}
			
		} catch(Exception ex) {
			System.out.println("Exception occured during the program: " + ex);
		} finally {
			if(input != null) {
				input.close();
			}
			System.out.println("Program exited successfully.");
		}
	}

	/**
	 * The method is used to display header message of the program.
	 */
	private static void showHeaderMessage() {
		System.out.println("");
		System.out.println("Please enter option > ");
		System.out.println("1. Check if the given string is Palindrome or not. ");
		System.out.println("2. Exit Program. ");
	}
	

	/**
	 * The method checks if the input string is Palindrome or not.
	 * @param param
	 * @return
	 */
	private static boolean isPalindrome(String param) {
		String inputStr = param.replaceAll("\\s+","").toLowerCase();
		boolean value = IntStream.range(0, inputStr.length() / 2)
				.noneMatch( i ->inputStr.charAt(i) != inputStr.charAt(inputStr.length()-1-i));
		return value;
	}
}
