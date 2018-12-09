import java.util.ArrayList;

public class WeatherStation implements Observable {

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
		observers.remove(observer);
	}

	public void setTemperature(int temperature){
		this.temperature = temperature;
		notifyObservers();
	}

	public void notifyObservers(){
		for(Observer observer : observers){
			observer.update();
		}
	}

	public int getTemperature(){
		return temperature;
	}

}