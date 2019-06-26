package JavaBasics;

public class A {
	
	public A() {
		System.out.println("Parent Class Const");
	}
	
	public A(int i) {
		System.out.println("Parent class const with value of i:"  +i );
	}
	
	public A(int i, int j) {
		System.out.println("Parent class const with the value of i and j");
		System.out.println(i);
		System.out.println(j);
	}

}
