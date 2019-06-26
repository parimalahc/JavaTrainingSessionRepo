package OOP3;

public class Base extends Shape{
	
	Base(){
		System.out.println("Base class constructor");
	}

	public static void main(String[] args) {
		
		
		Shape s = new Base();
		s.drawing();
		s.fill();

		Base b = new Base();
	}

	void drawing() {
	      System.out.println("Base---Drawing");
		
	}
	
	

}
