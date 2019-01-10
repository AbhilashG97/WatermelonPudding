/**
 * This class represents the client.
 */
public class Client {
    public static void main(String[] args) {
        AdapterInterface adapter = new Adapter(new Adaptee());
        adapter.request();
    }    
}