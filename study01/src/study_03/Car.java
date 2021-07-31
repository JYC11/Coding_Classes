package study_03;

public class Car {
	private String name;
	private String colour;
	private String number;
	private int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if (count >= 1) {
			this.count = count;			
		} else {
			System.out.println("Count must be greater than or equal to 1.");
		}
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", number=" + number + ", count=" + count + "]";
	}
}