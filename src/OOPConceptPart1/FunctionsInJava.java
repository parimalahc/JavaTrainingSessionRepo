package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int d = obj.pqr();
		System.out.println(d);
		String t = obj.qa();
		System.out.println(t);
		int e = obj.division(100, 5);
		System.out.println(e);
		
	}
	public void test() {			
			System.out.println("test method");			
		}
	
	public int pqr() {
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c = a+b;
		
		return c;
		}
	
	public String qa() {
		System.out.println("QA Method");
		
		String s = "Hello World";
		
		return s;
		
	}
		
		public int division(int x, int y) {
			System.out.println("Division Method");
			int z= x/y;
			return z;
		}
		
		
		
	

}
