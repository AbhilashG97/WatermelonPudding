/**
 * This is the concrete adapter class.
 * It contains the implementation of all the abstract methods defined 
 * in the VoltageAdapterInterface
 */
public class VoltageAdapter implements VoltageAdapterInterface {

    private Socket socket;

    public VoltageAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Volt get100Volt() {
        return convertVoltage(socket.getVolt(), 100);
    }

    @Override
    public Volt get40Volt() {
        return convertVoltage(socket.getVolt(), 40);
    }

    @Override
    public Volt get10Volt() {
        return convertVoltage(socket.getVolt(), 10);
    }

    /**
     * This is a helper method that converters 120 volts to different voltages.
     */
    private Volt convertVoltage(Volt currentVoltage, int requiredVoltage) {
        switch(requiredVoltage) {

            case 100:
                return new Volt(currentVoltage.getVoltage()-20);
            case 40:
                return new Volt(currentVoltage.getVoltage()/3);
            case 10:
                return new Volt((currentVoltage.getVoltage()/10)-2);
            default: 
                return currentVoltage;
        }
    }

}