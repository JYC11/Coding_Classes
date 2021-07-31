package study_03;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColour("black");
		c.setName("Avante");
		c.setNumber("7897");
		System.out.println(c);
		Taxi t = new Taxi();
		t.setColour("black");
		t.setName("Avante");
		t.setNumber("7897");
		t.setArea("Seoul");
		System.out.println(t);
	}

}
