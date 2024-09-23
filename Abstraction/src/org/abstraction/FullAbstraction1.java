package org.abstraction;

public class FullAbstraction1 implements FullAbstraction {

	@Override
	public void empId(int a) {
		System.out.println("Emp id is 001");
	}

	@Override
	public void empName() {
		System.out.println("Emp name is Kaviya");
	}

	@Override
	public void EmpAtm() {
		System.out.println("Emp Atm pin is 4050");
	}
	public static void main(String[] args) {
		FullAbstraction1 f=new FullAbstraction1();
		f.empId(21);
		f.empName();
		f.EmpAtm();
	}
	
}
