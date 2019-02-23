public class ToggleSwitch {
    private ICommand pressCommand;
    private boolean executed = false;

    public ToggleSwitch(ICommand pressCommand) {
        this.pressCommand = pressCommand;
    }

    public void press() {
        if (!this.executed) {
            this.pressCommand.execute();
            this.executed = true;
        } else {
            this.pressCommand.undo();
            this.executed = false;
        }
    }
}