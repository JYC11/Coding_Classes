package study01_1;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	
	
	public Tv() {
		super();
	}

	Tv(String color, int channel, boolean power){
		this.color = color;
		this.power = power;
		this.channel = channel;
	};
	
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}


class CaptionTv extends Tv {
	boolean caption;
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}


class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello World");
		ctv.caption = true;
		ctv.displayCaption("Hello World");
	}
}