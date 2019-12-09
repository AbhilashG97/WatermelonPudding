public class Fan {
    
    State current, on, off;

    Fan(State... states){
        on = states[0];
        off = states[1];
        current = off;
    }

    public void rotate() {
        current.rotate();
    }

    public void stop() {
        current.stop();
    }

}