public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    int commandsCapacity = 5;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[commandsCapacity];
        offCommands = new Command[commandsCapacity];

        Command noCommand = new NoCommand();
        for (int i = 0; i < commandsCapacity; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        // track the latest command for undo operation
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        // track the latest command for undo operation
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " "
                    + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
