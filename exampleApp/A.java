package org.jmz.exampleApp;
public class A {
	public void testA() {
		System.out.println("test A method");
	}
}
class B extends A{
	public void  testB() {
		System.out.println("test B method ");
	}
	public static void main(String[] args) {
		B b=new B();
		b.testA();
		b.testB();
	}
}
