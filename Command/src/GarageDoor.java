public class GarageDoor {

    String location;

    public GarageDoor(String location){
        this.location = location;
    }

    public void up(){
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }

    public void lockDown() {
        System.out.println("Garage door is locked");
    }

    public void releaseLock() {
        System.out.println("Garage door is unlocked");
    }
}
