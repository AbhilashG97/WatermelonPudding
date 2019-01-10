/**
 * This class is a simple POJO.
 */
public class Volt {
    
    private int voltage;

    public Volt(int voltage) {
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }
    
    public void setVoltage(int newVoltage) {
        voltage = newVoltage;
    }

    @Override
    public String toString() {
        return Integer.toString(voltage);
    }
}   