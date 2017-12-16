public class OctalObserver implements Observer {

    private Observable observable;

    public OctalObserver(Observable observable){
        this.observable = observable;
        this.observable.add(this);
    }

    public void update(){
        System.out.println("Octal Value -> "+Integer.toOctalString(observable.getState()));
    }

}