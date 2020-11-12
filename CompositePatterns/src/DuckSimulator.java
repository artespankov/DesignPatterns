public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DecoratedDuckFactory();

        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createDuckGoose();

        System.out.println("\nDuck Simulator: With Composite — Flocks");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfStuff = new Flock();
        flockOfStuff.add(rubberDuck);
        flockOfStuff.add(duckCall);

        flockOfDucks.add(flockOfStuff);




        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

//        System.out.println("\nDuck Simulator: Stuff Flock Simulation");
//        simulate(flockOfStuff);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}