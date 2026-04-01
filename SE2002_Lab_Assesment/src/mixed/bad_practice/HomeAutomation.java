interface Device {
    void turnOn();
    void adjustTemperature(int t); // Only for AC
}

public class HomeAutomation {
    public void manage(Device d, String action) {
        // Error If we add 'Light', 'Fan', 'AC', this logic grows forever
        if (d instanceof AirConditioner) {
            d.turnOn();
            d.adjustTemperature(24);
        }
    }
}

class AirConditioner implements Device {
    public void turnOn() { System.out.println("AC On"); }
    public void adjustTemperature(int t) { System.out.println("Temp set to " + t); }
}

class Light implements Device {
    public void turnOn() { System.out.println("Light On"); }
    // Error Lights don't have temperature!
    public void adjustTemperature(int t) { throw new RuntimeException(); }
}