package ch06_command.simple;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
    }
}
