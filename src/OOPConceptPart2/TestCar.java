package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		BMW b1 = (BMW)new Car();// Class cast Exception
		
		

	}

}
