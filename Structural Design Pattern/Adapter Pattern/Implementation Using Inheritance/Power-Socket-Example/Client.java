public class Client {
    public static void main(String[] args) {
        Socket socket = new Socket();

        System.out.println("Voltage present in socket "+socket.getVolt());

        VoltageAdapter VoltageAdapter = new VoltageAdapter(socket);

        System.out.println("After using adapters, we get the following converted voltages");
        System.out.println(VoltageAdapter.get100Volt());
        System.out.println(VoltageAdapter.get40Volt());
        System.out.println(VoltageAdapter.get10Volt());
    }
}