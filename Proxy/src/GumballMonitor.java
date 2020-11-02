public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine){
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation()); 
        System.out.println("Current inventory: " + machine.count + " gumballs");
        System.out.println("Current state: " + machine.state);
    }

}


