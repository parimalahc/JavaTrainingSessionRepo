package JavaBasics;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param Const");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("two param const");
		System.out.println(i);
		System.out.println(j);
	}
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		
		

	}

}
