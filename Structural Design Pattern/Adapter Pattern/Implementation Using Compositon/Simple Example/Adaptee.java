/**
 *  This is the adaptee. This represents the incompatible class
 *  which is required by the Client
 */
public class Adaptee {
    /**
     *  This is the method which is required by the client class.
     */
    public void specificRequest() {
        System.out.println("This is a specific request of the Adaptee.");
    }
}