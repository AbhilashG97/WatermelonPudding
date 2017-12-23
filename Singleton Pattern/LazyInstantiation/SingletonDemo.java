public class SingletonDemo {

	public static void main(String[] args) {
		Singleton singletonObject = Singleton.getInstance();
		singletonObject.showMessage();	
	}
}