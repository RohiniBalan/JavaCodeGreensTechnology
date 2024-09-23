package org.poly;

public class methodOverloading {
	
	//1 METHOD AND 1 ARGUMENT
	private void methodData(String name) {
		System.out.println("My name is "+name);
	}
	
	//1 METHOD AND MORE THAN 1 ARGUMENT
	private void methodData(int age,String names) {
		System.out.println("My age is "+age +"\n"+ "My name is "+names);
	}
	
	//MORE THAN 1 ARGUMENET BUT ORDER CHANGE (IN THE ABOVE AND BELOW METHOD THE ARGUMENTS ARE CHANGED)	 
	private void methodData(String name,int salary) {
		System.out.println("My name is "+name +"\n"+ "My salary is "+salary);
	}
	public static void main(String[] args) {
		methodOverloading m=new methodOverloading();
		m.methodData("Rohini");
		m.methodData(20,"Kaviya");
		m.methodData("Deepak", 30000);
	}
}
