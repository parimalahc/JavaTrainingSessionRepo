package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println((x+y+(a+b)));
		
		System.out.println("The value of a is:" + a);
		System.out.println("The addition of a and b is " +(a+b));

	}

}
