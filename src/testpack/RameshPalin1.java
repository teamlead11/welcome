package testpack;

public class RameshPalin1 
{

	public static void checkPalindrome(String s) 
	{
		String reverse=new StringBuffer(s).reverse().toString();
		if (s.equals(reverse)) 
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) 
	{
		checkPalindrome("madam");
		checkPalindrome("india");
		checkPalindrome("amma");
		

	}
}
