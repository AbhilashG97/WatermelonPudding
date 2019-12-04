public class Singleton {

	private static final Singleton singletonObject = new Singleton();

	private Singleton(){
		
	}

	public static Singleton getInstance(){
		return singletonObject;
	}

	public void showMessage(){
		System.out.println("Hajimemashite");
	}

}