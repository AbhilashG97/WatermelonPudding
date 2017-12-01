public class DemoObserver {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		PhoneDisplay motog5 = new PhoneDisplay(weatherStation);
		PhoneDisplay redmi5 = new PhoneDisplay(weatherStation);
		LCDDisplay samsungTV = new LCDDisplay(weatherStation);


		// Broadcast temperature
		
		weatherStation.setTemperature(12);
		System.out.println("*************************");
		weatherStation.setTemperature(56);

	}
}