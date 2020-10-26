public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor door){
        garageDoor = door;
    }

    public void execute() {
        garageDoor.down();
        garageDoor.lockDown();
    }

    public void undo(){
        garageDoor.releaseLock();
    }
}
