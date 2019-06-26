package JavaBasics;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@##@#@#@# Java 45678 @#%^&*() Selenium";
		s = s.replaceAll("[^a-z0-9A-Z]", "");
		System.out.println(s);

	}

}
