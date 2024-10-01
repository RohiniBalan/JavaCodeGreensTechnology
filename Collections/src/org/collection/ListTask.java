package org.collection;
import java.util.ArrayList;
import java.util.List;

public class ListTask {
	public static void main(String[] args) {
		List li=new ArrayList(4);
		li.add(45);
		li.add("Rohini");
		li.add(true);
		li.add('R');
		System.out.println(li);
		
		//List methods
		int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf("Rohini");
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf('R');
		System.out.println(lastIndexOf);
		
		boolean contains = li.contains(45);
		System.out.println(contains);
		
		Object remove = li.remove(2);
		System.out.println(remove);
		System.out.println(li);
		
		Object object = li.get(2);
		System.out.println(object);
		
		for (int i=0;i<=3;i++) {
			System.out.println(li.get(i));
		}
		
		for (Object a:li) {
			System.out.println(a);
		}
		
	}
}
