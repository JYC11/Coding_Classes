package homework;

public class Car {
	String name;
	int number;

	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}

}

class Bus extends Car {
	int fee;
	
	public Bus(String name, int number, int fee) {
		super(name,number);
		this.fee = fee;
	}
}