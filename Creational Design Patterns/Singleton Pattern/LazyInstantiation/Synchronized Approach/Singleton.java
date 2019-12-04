public class Singleton {

	private static Singleton singletonObject;

	private Singleton(){
		// Default constructor
	}

	public static synchronized Singleton getInstance(){
		if(singletonObject == null){
			return new Singleton();
		}

		return singletonObject;
	}

	public void showMessage(){
		System.out.println("Namaste");
	}
}