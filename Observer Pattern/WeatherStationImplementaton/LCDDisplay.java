public class LCDDisplay extends Observer{

	private WeatherStation weatherStation;

	public LCDDisplay(WeatherStation weatherStation){
		this.weatherStation = weatherStation;
		this.weatherStation.add(this);
	}

	public void update(){
		System.out.println("LCD Temperature -> "+weatherStation.getTemperature()+"*C");
	}

}
