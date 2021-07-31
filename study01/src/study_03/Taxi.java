package study_03;

public class Taxi extends Car{
	
	private String area;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String toString() {
		return super.toString() + " area: " + area;
	}
	
}
