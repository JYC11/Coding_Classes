package homework03;
import study_03.Car;

public class CarTest {

	public static void main(String[] args) {
		CarManager manager = new CarManager();
		Car c1 = new Car();
		c1.setColour("orange");
		c1.setCount(1);
		c1.setName("Avante");
		c1.setNumber("AFKHJ1234");
		manager.add(c1);
		Bus b1 = new Bus();
		b1.setBusNum("332");
		b1.setColour("Blue");
		b1.setCount(1);
		b1.setName("Bus1");
		b1.setNumber("MFKGEJE650740");
		manager.add(b1);
		Car t1 = new Car();
		t1.setName("kakao taxi");
		t1.setColour("yellow");
		t1.setCount(20);
		t1.setNumber("ABCD");
		Car t2 = new Car();
		t2.setName("uber taxi");
		t2.setColour("black");
		t2.setCount(3);
		t2.setNumber("BFJOWE");
		Car t3 = new Car();
		t3.setName("lyft taxi");
		t3.setColour("white");
		t3.setCount(1);
		t3.setNumber("RRRR");
		manager.add(t1);
		manager.add(t2);
		manager.add(t3);
		System.out.println(manager.cars);
		System.out.println(manager.taxiList());
		System.out.println(manager.busList());
		manager.searchCar("ABCD");
	}

}
