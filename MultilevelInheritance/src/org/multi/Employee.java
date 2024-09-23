package org.multi;
//CHILD CLASS
public class Employee extends Company {
	private void empId() {
		System.out.println(" My employee id is 101");
	}
	private void empName() {
		System.out.println("My employee name is Kaviya");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.companyId();
		e.companyName();
		e.staffId();
	}
}
