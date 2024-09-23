package org.poly;

public class methodOverRiding extends mORCompany {
	private void methodData(String name) {
		System.out.println("My name is "+name);
		this.methodData(20);
		super.Empdata("chocolate");
	}
	
	private void methodData(int age) {
		System.out.println("My age is "+age );
	}
		 
		
	public static void main(String[] args) {
		methodOverRiding m=new methodOverRiding();
		m.methodData("Rohini");
	}
}
