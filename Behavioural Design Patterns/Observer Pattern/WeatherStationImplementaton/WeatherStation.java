import java.util.ArrayList;

public class WeatherStation implements Subject {

	private int temperature;
	private ArrayList<Observer> observers;

	public WeatherStation(){
		temperature = 0;
		observers = new ArrayList<>();
	}

	public void add(Observer observer){
		observers.add(observer);
	}

	public void remove(Observer observer){
		
		int value = observers.indexOf(observer);

		if (value >= 0) {
			observers.remove(value);
		}
	}

	public void setTemperature(int temperature){
		this.temperature = temperature;
		notifyObservers();
	}

	public void notifyObservers(){
		for(Observer observer : observers){
			observer.update(temperature);
		}
	}

	public int getTemperature(){
		return temperature;
	}
}