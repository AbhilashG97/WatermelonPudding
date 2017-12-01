import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StockDataCenter stockDataCenter = new StockDataCenter();

		Observer observer1 = new StockWatcher(stockDataCenter);

		stockDataCenter.setGoog(scanner.nextInt());
		stockDataCenter.setAapl(scanner.nextInt());

		Observer observer2 = new StockWatcher(stockDataCenter);

		stockDataCenter.setGoog(scanner.nextInt());
		stockDataCenter.setAapl(scanner.nextInt());		
	}
}