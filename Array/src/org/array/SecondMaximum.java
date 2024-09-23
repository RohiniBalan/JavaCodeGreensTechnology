//Second Maximum

package org.array;
import java.util.Scanner;
public class SecondMaximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m1=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>m1) {
				m1=a[i];
			}
		}
		//int m2=a[0];
		int m2;
		m2=(m1>a[0])?a[0]:a[1];
		for(int i=1;i<n;i++) {
			if(a[i]!=m1) {
				if(a[i]>m2) {
					m2=a[i];
				}
			}
		}
		System.out.println(m2);
	}
}
