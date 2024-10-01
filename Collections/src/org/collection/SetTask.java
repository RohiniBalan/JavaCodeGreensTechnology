package org.collection;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTask {
	public static void main(String[] args) {
		//Hashset print the value is random order
		Set s=new HashSet();
		s.add(10);
		s.add("Rohini");
		s.add('b');
		s.add(45.836);
		s.add(true);
		System.out.println(s);
		int size = s.size();
		System.out.println(size);
		
		// Linkedhashset prints the value in given order
		Set s1=new LinkedHashSet();
		s1.add(20);
		s1.add(26.32984);
		s1.add("Deepak");
		s1.add(false);
		s1.add('b');
		System.out.println(s1);
		
		// if Treeset contains dissimilar values it show error in output
//		Set s2=new TreeSet();
//		s2.add(10);
//		s2.add("Rohini");
//		s2.add('b');
//		s2.add(45.836);
//		s2.add(true);
//		System.out.println(s2);

		// if Treeset contains similar values then it prints the value in ascending order
		Set s3=new TreeSet();
		s3.add(40);
		s3.add(68);
		s3.add(29);
		s3.add(03);
		s3.add(94);
		s3.add(84);
		System.out.println(s3);
		
		Set s4=new TreeSet();
		s4.add("Rahul");
		s4.add("Rohini");
		s4.add("Kaviya");
		s4.add("Deepak");
		s4.add("Tharaneesh");
		s4.add("Tamil Selvan");
		s4.add("Kavi Prasath");
		System.out.println(s4);
		
	}
}
