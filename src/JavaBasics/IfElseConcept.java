package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		
		if(a>b) {
			
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}

		int c=500;
		int d=800;
		int e=300;
		
		if (c>d & c>e) {
			System.out.println("c is the greatest");
		}
			else if(d>e) {
				System.out.println("d is the greatest");
			}else {
				System.out.println("e is the greatest");
		}
		
		}

}
