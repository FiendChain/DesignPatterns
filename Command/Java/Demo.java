public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        ToggleSwitch lightSwitch = new ToggleSwitch(lightOnCommand);
        lightSwitch.press();
        lightSwitch.press();
        lightSwitch.press();
    }
}