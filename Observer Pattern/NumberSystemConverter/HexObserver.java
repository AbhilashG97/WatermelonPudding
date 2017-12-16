public class HexObserver implements Observer {

    private Observable observable;

    public HexObserver(Observable observable){
        this.observable = observable;
        this.observable.add(this);
    }

    public void update(){
        System.out.println("Hex Value -> "+Integer.toHexString(observable.getState()));
    }

}