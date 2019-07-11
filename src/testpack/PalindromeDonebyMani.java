package testpack;

public class PalindromeDonebyMani {

	public static void main(String[] args) {
		
		String S = "malayalam";
		String S1="";
		for (int i =S.length()-1; i >=0; i--) {
			S1=S1+S.charAt(i);
			
		} 
		if(S1.equals(S))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palidrome");
		}
	
	}
}
