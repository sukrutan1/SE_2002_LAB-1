interface Device {
    void executeAction();
}

interface Switchable {
    void turnOn();
}

interface Thermostat {
    void adjustTemperature(int t);
}

public class HomeAutomation {
    public void manage(Device d) {
        d.executeAction();
    }
}

class AirConditioner implements Device, Switchable, Thermostat {
    @Override
    public void turnOn() { System.out.println("AC On"); }
    
    @Override
    public void adjustTemperature(int t) { System.out.println("Temp set to " + t); }
    
    @Override
    public void executeAction() {
        turnOn();
        adjustTemperature(24);
    }
}

class Light implements Device, Switchable {
    @Override
    public void turnOn() { System.out.println("Light On"); }
    
    @Override
    public void executeAction() {
        turnOn();
    }
}