package org.program;

public class PalindromeTask {
	public static void main(String[] args) {
		String c="Racecar";
		String d="";
		for(int i=c.length()-1;i>=0;i--) {
			d=d+c.charAt(i);
		}
		if(c.equalsIgnoreCase(d)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
