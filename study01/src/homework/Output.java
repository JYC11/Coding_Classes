package homework;

public class Output {
	public static void main(String[] args) {
		Human p1 = new Human(20,"Hong Gil Dong",1000000);
		Human p2 = new Human(30,"Lee Soon Shin",2000000);
		Human p3 = new Human(40,"Eul Ji Moon Duk",3000000);
		p1.printStatus();
		p2.printStatus();
		p3.printStatus();
		
		Adder a = new Adder(1,2);
		a.printAddition();
	}
}
