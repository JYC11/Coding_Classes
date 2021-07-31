package study01_1;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		Car car2 = new Car();
		
		fe.water();
		car = fe;
		//car.water();
		car.drive();
		fe2 = (FireEngine) car;
		fe2.water();
		fe2.drive();
		car2.drive();
	}
}

class Car {
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
}

class FireEngine extends Car {
	
	void drive() {
		System.out.println("Brrrrr");
	}
	
	void water() {
		System.out.println("water!");
	}
}