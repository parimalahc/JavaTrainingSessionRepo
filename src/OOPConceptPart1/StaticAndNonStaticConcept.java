package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		

	}
	
	public void sendMail() {
		System.out.println("Send Mail method");
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}
	
	
}
