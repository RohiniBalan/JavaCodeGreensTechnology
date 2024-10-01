package org.collection;

import java.util.*;

public class GenericsTask {
	public static void main(String[] args) {
		
		// List 1
		List <Integer>l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		// List 2
		List <Integer>l2=new ArrayList();
		l2.add(20);
		l2.add(40);
		l2.add(60);
		l2.add(30);
		System.out.println(l2);
		
		// Methods of Generics 
		//removeAll
//		l1.removeAll(l2);
//		System.out.println(l1);
//		
//		l2.removeAll(l1);
//		System.out.println(l2);
		
		// retainAll
		l1.retainAll(l2);
		System.out.println(l1);
		
		l1.addAll(l2);
		System.out.println(l1);
		
		l2.clear();
		System.out.println(l2);
	}
}
