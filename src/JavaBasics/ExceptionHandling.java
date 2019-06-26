package JavaBasics;

public class ExceptionHandling {
	
	int a = 10;
	static ExceptionHandling obj; 

	public static void main(String[] args) throws InterruptedException {

//        //uncaught exception
//		int i = 9/0;
//		System.out.println(i);
//		
//		//caught Exception
//		Thread.sleep(2000);
		
//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;
//		
//		System.out.println(obj.a);
//		

//		System.out.println(obj.a);
		
		
		//try-catch block
		try {
			int i = 9/0;
			System.out.println(i);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey this is / by zero error");
		}
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}
