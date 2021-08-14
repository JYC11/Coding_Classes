package homework4;

@SuppressWarnings("serial")
public class CarNumException extends Exception{
	private String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public CarNumException(String msg) {
		super(msg);
	}
}
