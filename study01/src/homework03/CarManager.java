package homework03;
import study_03.Car;
import java.util.*;

public class CarManager {
	ArrayList<Car> cars = new ArrayList<Car>();
	public void add(Car c) {
		if(cars.size()<10) {
			cars.add(c);
		} else {
			System.out.println("Manager can only manage 10 cars.");
		}
	}
	
	public ArrayList<Car> taxiList() {
		ArrayList<Car> taxis = new ArrayList<Car>();
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getName().toLowerCase().contains("taxi")) {
				taxis.add(cars.get(i));
			};
		}
		return taxis;
	}
	
	public ArrayList<Car> busList() {
		ArrayList<Car> buses = new ArrayList<Car>();
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i) instanceof Bus) {
				buses.add(cars.get(i));
			}
		}
		return buses;
		
	}
	
	public void searchCar(String number) {
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getNumber() == number) {
				System.out.println(cars.get(i));
			}
		}
	}
}
