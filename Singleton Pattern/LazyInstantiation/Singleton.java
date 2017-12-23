public class Singleton {

	private static Singleton singletonObject;

	private Singleton(){

	}

	public static Singleton getInstance(){
		if(singletonObject == null){
			return new Singleton();
		}

		return singletonObject;
	}

	public void showMessage(){
		System.out.println("Namaste");
	}
}