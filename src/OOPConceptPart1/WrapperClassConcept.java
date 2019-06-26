package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		
		String y = "12.33";
		System.out.println(y);
		
		double j = Double.parseDouble(y);
		System.out.println(j+30);
		
		
		String z = "true";
		System.out.println(z);
		
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		int a = 100;
		System.out.println(a);
		
		String c = String.valueOf(a);
		System.out.println(c+50);

	}

}
