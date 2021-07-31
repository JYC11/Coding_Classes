package homework;

public class Adder {
	int x,y;
	
	public Adder(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void printAddition() {
		System.out.printf("%d + %d = %s%n", x, y, Integer.toString(x)+Integer.toString(y));
		System.out.printf("%d + %d = %d%n", x, y, x+y);
	}
	
}
