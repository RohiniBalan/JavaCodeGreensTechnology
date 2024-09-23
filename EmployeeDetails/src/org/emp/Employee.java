package org.emp;

public class Employee {
	private void empId() {
		System.out.println("E21044");
	}
	private void empName() {
		System.out.println("Rohini");
	}
	private void empDob() {
		System.out.println("04-05-2004");
	}
	private void empPhone() {
		System.out.println("8056704459");
	}
    private void empEmail() {
		System.out.println("rohinibalan529@gmail.com");
	}
    private void empAddress() {
		System.out.println("Banglore");
	}
    public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
