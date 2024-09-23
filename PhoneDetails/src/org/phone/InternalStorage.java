package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Helio G85");
	}
	private void mobileRAM() {
		System.out.println("4GB RAM");
	}
	public static void main(String[] args) {
		InternalStorage i=new InternalStorage();
		i.processorName();
		i.mobileRAM();
		ExternalStorage e=new ExternalStorage();
		e.size();
	}
}
