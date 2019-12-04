public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // default private method
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); 
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Do something here.");
    }

}