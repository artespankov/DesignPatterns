public class Light {

    String location;

    public Light(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("The Light is ON");
    }
    public void off(){
        System.out.println("The Light is OFF");
    }
}
