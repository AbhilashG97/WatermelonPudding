public class Adapter implements AdapterInterface {
    
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Modified by the adapter");
        adaptee.specificRequest();
    }

}