package org.program;

public class LogicalTask {
	public static void main(String[] args) {
		// Reverse a String
		String s="rohini";
		//String a="";
		for(int i=s.length()-1;i>=0;i--) {
			//a=a+name.charAt(i);
			System.out.println(s.charAt(i));
		}
		//System.out.println(a);
		
		
		// To check palindrome or not 
		String b="madam";
		String c="";
		for (int i=b.length()-1;i>=0;i--) {
			c=c+b.charAt(i);
		}
		if (b.equals(c)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
}
