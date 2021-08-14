package homework4;
import java.util.ArrayList;
import study_03.Car;

public interface CarManagerInterface {
	public static final ArrayList<Car> cars = new ArrayList<Car>();
	
	public abstract void add(Car c);
	
	public abstract ArrayList<Car> taxiList();
	
	public abstract ArrayList<Car> busList();
	
	public abstract void searchCar(String number) throws CarNumException;
}
