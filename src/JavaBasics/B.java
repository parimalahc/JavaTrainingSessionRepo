package JavaBasics;

public class B extends A{

	
	public B() {
		super();
		System.out.println("Child Class Const");
	}
	
	public B(int i) {
		super (i);
	}
	
	public B(int i, int j) {
		super(i,j);
	}
	
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);

	}

}
