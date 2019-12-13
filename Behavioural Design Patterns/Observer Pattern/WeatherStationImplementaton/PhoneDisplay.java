public class PhoneDisplay implements Observer, DisplayElement {

	private WeatherStation weatherStation;
	private int temperature;

	public PhoneDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.add(this);
	}

	@Override
	public void update(int temperature) {
		this.temperature = temperature;
		display();
	}

	@Override
	public void display() {
		System.out.println("Phone display : " + temperature + " Celcius");
	}
}