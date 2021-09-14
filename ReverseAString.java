package pavan;

import java.util.Scanner;

public class ReverseAString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String original;    //for storing user input
		String rev = "";     //for storing of string
		
		                      //taking input from user
		System.out.println("Enter String to Reverse");
		Scanner sc = new Scanner(System.in);
		//TO GIVE INPUT DURING RUN TIME
		original = sc.nextLine();
	int len = original.length();
	
	for(int i= len-1;i>=0;i--)
		rev = rev+original.charAt(i);//returns a character at a specific index position in a string
	
	//lets print  the string objects
	System.out.println("Reverse of string is;" + rev);
		
		
		}

	}


