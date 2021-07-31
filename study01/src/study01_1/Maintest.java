package study01_1;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv mytv = new Tv();
		mytv.channel = 1;
		mytv.color = "black";
		mytv.power = true;
		
		mytv.channelUp();
		System.out.println(mytv.channel);
		
		Tv newtv = new Tv("red",3,false);
		
		newtv.channelDown();
		System.out.println(newtv.channel);
	}

}
