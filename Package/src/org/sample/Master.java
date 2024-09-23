package org.sample;
import org.base.Company;
//CHILD CLASS
public class Master {
	private void masterId() {
		System.out.println("My master id is M987");
	}
	private void masterName() {
		System.out.println(" My master name is Deepak");
	}
	public static void main(String[] args) {
		Master m=new Master();
		m.masterId();
		m.masterName();
		Company c=new Company();
		c.companyId();
		c.companyName();
	}
}
