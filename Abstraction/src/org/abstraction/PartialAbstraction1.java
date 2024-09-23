package org.abstraction;

public class PartialAbstraction1 extends PartialAbstraction {

	@Override
	public void EmpAtm() {
		System.out.println("Atm pin is 2909");
		
	}
	public static void main(String[] args) {
		PartialAbstraction1 p=new PartialAbstraction1();
		p.empId(15);
		p.empName();
		p.EmpAtm();
	}
}
