package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading ob = new MethodOverloading();
		ob.sum();
		ob.sum(10);
		ob.sum(20, 30);
		
		
}

	public void sum() {
		System.out.println("Sum method - zero parameter");
	}
	
	public void sum(int a) {
		System.out.println("Sum method - one parameter");
		System.out.println(a);
	}
	
	public int sum(int b, int c) {
		System.out.println("Sum method - Two parameters");
		int e = b+c;
		return e;
	}
}
