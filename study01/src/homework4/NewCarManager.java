package homework4;
import java.util.*;
import homework03.Bus;
import study_03.Car;
import study_03.Taxi;

public class NewCarManager implements CarManagerInterface{
	ArrayList<Car> cars = new ArrayList<Car>();
	
	@Override
	public void add(Car c) {
		if(cars.size()<10) {
			cars.add(c);
		} else {
			System.out.println("Manager can only manage 10 cars.");
		}
	}

	@Override
	public ArrayList<Car> taxiList() {
		ArrayList<Car> taxis = new ArrayList<Car>();
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i) instanceof Taxi) {
				taxis.add(cars.get(i));
			};
		}
		return taxis;
	}

	@Override
	public ArrayList<Car> busList() {
		ArrayList<Car> buses = new ArrayList<Car>();
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i) instanceof Bus) {
				buses.add(cars.get(i));
			}
		}
		return buses;
	}

	@Override
	public void searchCar(String number) throws CarNumException {
		boolean found = false;
		
		
		for (int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getNumber() == number) {
				found = true;
				System.out.println(cars.get(i));
			}
		}
		
		if (found == false) {
			throw new CarNumException("No car found with this number");
		}
		
		
	}
	
	


}
