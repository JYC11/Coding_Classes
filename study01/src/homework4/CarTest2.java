package homework4;
import study_03.Car;

public class CarTest2 {

	public static void main(String[] args) throws CarNumException {
		NewCarManager manager = new NewCarManager();
		Car c1 = new Car();
		c1.setColour("orange");
		c1.setCount(1);
		c1.setNumber("AFKHJ1234");
		manager.add(c1);
		
		Object carCopy = c1.clone();
		System.out.println(carCopy);
		
		try {
			manager.searchCar("Test");			
		} catch (CarNumException e) {
			System.out.println(e);
		}
		
	}

}
