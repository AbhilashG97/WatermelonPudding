public class Off implements State {

    private Fan fan;

    public void rotate() {
        System.out.println("Fan stopped");
        fan.current = fan.off;
    }

    public void stop() {
        System.out.println("Fan isn't running!!");
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

}