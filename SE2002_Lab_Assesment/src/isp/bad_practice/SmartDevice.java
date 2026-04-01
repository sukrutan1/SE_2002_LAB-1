public interface SmartDevice {
    void print();
    void scan();
    void fax();
}

class SimplePrinter implements SmartDevice {
    public void print() { System.out.println("Printing..."); }

    // Violation: Forcing a simple printer to have fax/scan capabilities
    public void scan() { /* Do nothing */ }
    public void fax() { /* Do nothing */ }
}