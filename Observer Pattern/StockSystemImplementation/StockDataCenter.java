import java.util.ArrayList;

public class StockDataCenter implements Observable {

	private int goog;
	private int aapl;
	private int sensex;

	private ArrayList<Observer> observers;

	public StockDataCenter(){
		observers = new ArrayList<>();
		goog = aapl = sensex = 0;
	}

	public void add(Observer observer){
		observers.add(observer);
	}

	public void remove(Observer observer){
		observers.remove(observers.indexOf(observer));
	}

	public int getGoog(){
		return goog;
	}

	public int getSensex(){
		return sensex;
	}

	public int getAapl(){
		return aapl;
	}

	public void setGoog(int goog){
		this.goog = goog;
		notifyObservers();
	}

	public void setSensex(int sensex){
		this.sensex = sensex;
		notifyObservers();
	}

	public void setAapl(int aapl){
		this.aapl = aapl;
		notifyObservers();
	}

	public void notifyObservers(){
		for(Observer observer : observers){
			observer.update();
		}
	}
}