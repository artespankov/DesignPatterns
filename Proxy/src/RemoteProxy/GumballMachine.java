package RemoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private static final long serialVersionUID = 2L;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int countGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = countGumballs;
        if (count > 0) {
            state = noQuarterState;
        }
        else {
            state = soldOutState;
        }
        this.location = location;
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    void refill(int countGumballs){
        this.count += countGumballs;
        state.refill();
    }

    public String toString(){
        return "Machine in state: " + state + " with a number of gumballs left: " + count +"\n";
    }

    public int getCount() throws RemoteException {
        return count;
    }

    public String getLocation() throws RemoteException {
        return location;

    }

    public State getState() throws RemoteException {
        return state;
    }

}

