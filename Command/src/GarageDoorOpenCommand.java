public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door){
        garageDoor = door;
    }

    public void execute() {
        garageDoor.releaseLock();
        garageDoor.up();
    }

    public void undo(){
        garageDoor.down();
    }
}
