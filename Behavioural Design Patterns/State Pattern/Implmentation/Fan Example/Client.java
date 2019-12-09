public class Client {
    public static void main(String[] args) {
        On on = new On();
        Off off = new Off();

        Fan fan = new Fan(on, off);

        on.setFan(fan);
        off.setFan(fan);

        fan.rotate();
        fan.stop();
    }
}