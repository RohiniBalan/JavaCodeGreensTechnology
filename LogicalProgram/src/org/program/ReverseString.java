package org.program;

public class ReverseString {
	public static void main(String[] args) {
		String a="rohini";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		
		if(a.equals(b)) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
