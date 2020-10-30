package Refactored;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int countGumballs) {
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


}
