package study01_1;

class Data {
	int value;
	
	Data(){ value = 0; } //constructor
	
	Data(int x) { //constructor
		value = x+1;
	}
	
}

class ConstructorTest {
	public static void main(String[] args) {
		Data d1 = new Data(); //constructor
		Data d2 = new Data(1); //constructor
	}
}