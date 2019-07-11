package testpack;

public class AparnaPalindrome {
	public static void checkPalindrome(String s) 
	  { 
	     
	    String reverse = new StringBuffer(s).reverse().toString(); 
	  
	    if (s.equals(reverse)) 
	      System.out.println("it is a palindrome"); 
	  
	    else
	      System.out.println("It is not a palindrome"); 
	  } 
	  
	  public static void main(String[] args) { 
	    checkPalindrome("madam");
	    checkPalindrome("malayalam");
	    checkPalindrome("wrwew");
	    
	   
	  }
}
