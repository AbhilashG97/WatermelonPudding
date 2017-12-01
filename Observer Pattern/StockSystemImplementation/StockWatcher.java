public class StockWatcher implements Observer {

	private StockDataCenter stockDataCenter;
	private int observerID = 0;
	private static int observerIDTracker = 0;

	public StockWatcher(StockDataCenter stockDataCenter){
		this.stockDataCenter = stockDataCenter;
		this.stockDataCenter.add(this);
		observerID = ++observerIDTracker;
		System.out.println("Observer ID -> "+observerID);
	}

	public void update(){
		System.out.println("Google Stock -> "+stockDataCenter.getGoog()
			+"\nApple Stock -> "+stockDataCenter.getAapl());
	}

}