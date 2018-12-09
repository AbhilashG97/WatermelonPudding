import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Observable observable = new Subject();

        Observer binaryObserver = new BinaryObserver(observable);
        Observer octalObserver = new OctalObserver(observable);
        Observer hexObserver = new HexObserver(observable);

        observable.setState(scanner.nextInt());
        observable.setState(scanner.nextInt());
        observable.remove(octalObserver);
        observable.setState(scanner.nextInt());
    }
}