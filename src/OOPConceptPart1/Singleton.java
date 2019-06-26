package OOPConceptPart1;

public class Singleton {

	private static Singleton singleton_inst = null;
	public String str;

	private Singleton() {
		str = "Hey I am a Singleton class constructor";
	}

	public static Singleton getInstance() {
		if (singleton_inst == null)
			singleton_inst = new Singleton();
		return singleton_inst;

	}

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		

	}

}
