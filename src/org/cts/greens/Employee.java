package org.cts.greens;

public class Employee {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		try{
			String s= "ktk";
			System.out.println(s.charAt(6));
			}
		catch(ArithmeticException e){
			System.out.println("dont divide by zero");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("null value");
		}
		finally{
			System.out.println("final");
		}
		System.out.println(4);
		System.out.println(5);
	}

}
