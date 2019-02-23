public class LightOnCommand implements ICommand {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.turnOn();
    }

    public void undo() {
        this.light.turnOff();
    }
}

class Light {
    public void turnOff() {
        System.out.println("Light turned off");
    }

    public void turnOn() {
        System.out.println("Light turned on");
    }
}