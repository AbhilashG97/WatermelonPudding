import java.util.ArrayList;

public class Subject implements Observable {

    private ArrayList<Observer> observers;
    private int decimalInteger;
    
    public Subject(){
        observers = new ArrayList<>();
        decimalInteger = 0;
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observers.indexOf(observer));
    }

    public void setState(int decimalInteger){
        this.decimalInteger = decimalInteger;
        notifyObserver();
    }

    public int getState(){
        return decimalInteger;
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }

}