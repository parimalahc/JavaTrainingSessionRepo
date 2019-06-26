package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Parimala Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String flag = " ";
		if(flag.equals(" "))
			try {
				throw new Exception("KP Exception");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("TEST");

	}

}
