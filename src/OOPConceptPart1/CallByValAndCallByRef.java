package OOPConceptPart1;

public class CallByValAndCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
			int x = 10;
		    int y = 20;
		    obj.sum(x, y);// call by value
		    
		
		    obj.p = 50;
		    obj.q = 60;
		    
		    obj.swap(obj);		    
		    
		    System.out.println(obj.p);
		    System.out.println(obj.q);

	}
	
	public int sum(int a, int b) {
		a = 30;
		b = 40;
		int c= a+b;
		return c;
	}
	//call by reference
	public void swap(CallByValAndCallByRef t) {
      
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		}

}
