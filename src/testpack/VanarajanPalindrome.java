package testpack;

import java.util.Scanner;

public class VanarajanPalindrome 
{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original=sc.nextLine();
		int length=original.length();
		for( int i=length-1; i>=0; i--) 
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("entered string is a palindrome");
		else
			System.out.println("entered string is not a palindrome");
	
	}
}
