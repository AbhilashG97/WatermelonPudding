public class PhoneDisplay extends Observer{

	private WeatherStation weatherStation;

	public PhoneDisplay(WeatherStation weatherStation){
		this.weatherStation = weatherStation;
		this.weatherStation.add(this);
	}

	public void update(){
		System.out.println("Phone temperature -> " + weatherStation.getTemperature()+"*C");
	}

}