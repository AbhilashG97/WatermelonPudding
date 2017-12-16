public interface Observable {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
    void setState(int state);
    int getState();
}