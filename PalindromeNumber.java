package pavan;

import java.util.Scanner;

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value...: ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
			while(n>0)
		{
			rev=rev*10+n%10;//MOD
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+"is a Pallindrome Number....!!");
		}
		else
		{
			System.out.println(temp+"is not a Pallindrome Number...!!");
		}
	}
		

	}


