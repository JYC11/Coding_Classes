package homework;
import java.text.DecimalFormat;

public class Human {
	int age;
	String name;
	int money;
	
	Human(int age, String name,int money) {
		this.age = age;
		this.name = name;
		this.money = money;
	}
	
	String formatter(int money) {
		DecimalFormat d = new DecimalFormat();
		d.setGroupingSize(3);
		String formatted = d.format(money);
		return formatted;
	}
	
	void printStatus() {
		String formatted = this.formatter(money);
		System.out.printf("Age : %d , Name : %s, Money : %s won%n",age,name,formatted);
	}

}