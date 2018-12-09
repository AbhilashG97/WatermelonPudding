public class BinaryObserver implements Observer {

    private Observable observable;

    public BinaryObserver(Observable observable){
        this.observable = observable;
        this.observable.add(this);
    }

    public void update(){
        System.out.println("Binary Value -> "+Integer.toBinaryString(observable.getState()));
    }

} 