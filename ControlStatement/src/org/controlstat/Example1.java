package org.controlstat;

public class Example1 {
	private void even(int a) {
		if (a%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}
	private void odd(int b) {
		if (b%2==0) {
			System.out.println(b+" is even number");
		}
		else {
			System.out.println(b+" is odd number");
		}
	}
	public static void main(String[] args) {
		Example1 e=new Example1();
		e.even(18);
		e.odd(7);
	}
}
