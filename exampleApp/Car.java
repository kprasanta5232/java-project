package org.jmz.exampleApp;

public class Car {
	public void mileg() {
		System.out.println("30kih");
	}
}
class Maruti extends Car{
	
}
class Tesla extends Car{
	ElecticFeature eF=new ElecticFeature();
}
class main{
	public static void main(String[] args) {
		Maruti m=new Maruti();
		m.mileg();
		Tesla t=new Tesla();
		t.mileg();
		t.eF.charge();
	}
}
class ElecticFeature{
	void charge() {
		System.out.println("current charge");
	}
}