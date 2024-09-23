package org.str;

public class StringExercise {
	public static void main(String[] args) {
		String name="Rohini Balan";
		String a="  Tom and Jerry   ";
		String str1="Cartoon";
		String str2="cartoon";
		String value="doremon";
		
		int length = name.length();
		System.out.println(length);
		
		char charAt = name.charAt(5);
		System.out.println(charAt);
		
		int indexOf = name.indexOf("B");
		System.out.println(indexOf);
		
		int lastIndexOf = name.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		boolean empty = name.isEmpty();
		System.out.println(empty);
		
		boolean contains = name.contains("hi");
		System.out.println(contains);
		
		String trim = a.trim();
		System.out.println(trim);
		
		boolean startsWith = name.startsWith("R");
		System.out.println(startsWith);
		
		boolean endsWith = name.endsWith("ni");
		System.out.println(endsWith);
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase);
		
		String replace = value.replace("mon", "me");
		System.out.println(replace);
		
		String replaceAll = name.replaceAll("Rohini Balan", "Deepak Uma");
		System.out.println(replaceAll);
		
		String substring = a.substring(10);
		System.out.println(substring);
		
		String substring2 = name.substring(0, 6);
		System.out.println(substring2);
		
		int compareTo = name.compareTo(value);
		System.out.println(compareTo);
	}
}
