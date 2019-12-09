public class On implements State {

    private Fan fan;

    public void rotate() {
        System.out.println("Already rotating!!");
    }

    public void stop() {
        System.out.println("Fan stopped!!");
        fan.current = fan.off;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

}