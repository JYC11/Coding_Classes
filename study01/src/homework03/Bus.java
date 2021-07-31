package homework03;
import study_03.Car;

public class Bus extends Car{
	private String busNum;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		if (busNum.length() == 2 || busNum.length() == 3) {
			this.busNum = busNum;			
		} else {
			System.out.println("Bus number must be of length 2 or 3");
		}
	}
	@Override
	public String toString() {
		return "Bus [bus number=" + getBusNum() + ", name=" + getName() + ", colour=" + getColour()
				+ ", number=" + getNumber() + ", count=" + getCount() + "]";
	}
	
}
