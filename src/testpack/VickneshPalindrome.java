package testpack;

import java.util.Scanner;

public class VickneshPalindrome {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner vv=new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original=vv.nextLine();
		int length=original.length();
		for(int i=length-1; i>=0; i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("Entered string is not a palindrome");
			}
	}
