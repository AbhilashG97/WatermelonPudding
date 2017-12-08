import java.util.Scanner;

public class StrategyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Client client = new Client(new OperationAdd());
		System.out.println(client.operation(scanner.nextInt(), scanner.nextInt()));

		client = new Client(new OperationSubtract());
		System.out.println(client.operation(scanner.nextInt(), scanner.nextInt()));

		client = new Client(new OperationMultiply());
		System.out.println(client.operation(scanner.nextInt(), scanner.nextInt()));

		scanner.close();
	}

}