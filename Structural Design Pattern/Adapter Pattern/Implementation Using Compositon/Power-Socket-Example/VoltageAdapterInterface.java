/**
 * This is the interface for the adapter
 * A concrete class will implement this interface that will provide 
 * an appropriate impementation.
 */
public interface VoltageAdapterInterface {

    Volt get100Volt();

    Volt get40Volt();

    Volt get10Volt();
}