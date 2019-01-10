/**
 * This class is an Adaptee. The getVolt() method needs
 * an adapter which can convert the 120 volt AC to differnt 
 * voltages.
 */
public class Socket {
    
    /**
     * 
     * @return regular 120 Volt AC current
     */
    Volt getVolt() {
        return new Volt(120);
    }

}