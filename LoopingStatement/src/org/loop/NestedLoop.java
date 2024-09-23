package org.loop;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i=1;i<=6;i++) {
			for(int j=2;j<=5;j++) {
				System.out.println(j);
			}
			System.out.println("===");
			System.out.println(i);
			System.out.println("===");
		}
	}
}
