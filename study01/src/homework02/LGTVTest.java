package homework02;


interface LGTV {
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void volumeUp();
	public abstract void volumeDown();
}

class LGTV2016 implements LGTV {

	Boolean power = false;
	int volume = 10;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}

	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}

	
}

class LGTV2018 implements LGTV {

	Boolean power = false;
	int volume = 10;
	int x = 0;
	int y = 0;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}

	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	public void move(int a, int b) {
		x += a;
		y += b;
	}
	
}

class LGTV2020 implements LGTV {

	Boolean power = false;
	int volume = 10;
	int x = 0;
	int y = 0;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}

	public void volumeUp() {
		volume++;
	}
	
	public void volumeDown() {
		volume--;
	}
	
	public void move(int a, int b) {
		x += a;
		y += b;
	}
	
	public void speak() {
		Person p = new Person("Jaeyoon",25);
		String toPrint = String.format("Hi your name is %s and your age is %d",p.name, p.age);
		System.out.println(toPrint);
	}
	
}

class Person{
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class LGTVTest {

	public static void main(String[] args) {
		LGTV2016 tv1 = new LGTV2016();
		LGTV2018 tv2 = new LGTV2018();
		LGTV2020 tv3 = new LGTV2020();
		
		System.out.println("TV1 2016");
		System.out.println(tv1.power);
		tv1.powerOn();
		System.out.println(tv1.power);
		
		System.out.println("TV2 2018");
		System.out.println(tv2.x);
		System.out.println(tv2.y);
		tv2.move(20, 30);
		System.out.println(tv2.x);
		System.out.println(tv2.y);
		
		System.out.println("TV3 2020");
		tv3.speak();
	}

}
