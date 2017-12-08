public class DemoStrategy{
	public static void main(String[] args) {
		Client client = new Client(new Rectangle());
		client.drawShapes();

		client = new Client(new Circle());
		client.drawShapes();

		client = new Client(new Square());
		client.drawShapes();
	}
}