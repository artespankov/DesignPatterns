public class RemoteControlTest {

    public static void main(String[] args) {

        Light houseLight = new Light("House");
        LightOnCommand lightOn = new LightOnCommand(houseLight);
        LightOffCommand lightOff = new LightOffCommand(houseLight);

        GarageDoor yardGarageDoor = new GarageDoor("Yard");
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(yardGarageDoor);
        GarageDoorCloseCommand doorClosed = new GarageDoorCloseCommand(yardGarageDoor);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(1, lightOn, lightOff);
        remote.setCommand(2, doorOpen, doorClosed);
        System.out.println(remote);

        remote.onButtonWasPushed(2);
        remote.onButtonWasPushed(1);
        System.out.println(remote);
        remote.undoButtonWasPushed();

        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
        System.out.println(remote);
        remote.undoButtonWasPushed();


        // define sequence of commands
        Command[] leaveHome = {lightOff, doorClosed};
        Command[] backHome = {doorOpen, lightOn};
        MacroCommand morningRoutineMacro = new MacroCommand(leaveHome);
        MacroCommand eveningRoutineHomeMacro = new MacroCommand(backHome);
        remote.setCommand(0, morningRoutineMacro, eveningRoutineHomeMacro);
        System.out.println(remote);
        System.out.println("--- Pushing Macro for the Morning---");
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
//        System.out.println("--- Pushing Macro for the Evening---");
//        remote.offButtonWasPushed(0);


    }
}
