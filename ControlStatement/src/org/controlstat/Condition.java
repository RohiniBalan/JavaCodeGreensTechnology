package org.controlstat;

public class Condition {
	private void voter(int age) {
		if (age>18) {
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
	}
	public static void main(String[] args) {
		Condition a= new Condition();
		a.voter(20);
	}
}
