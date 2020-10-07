public class TurkeyTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();


        MallardDuck duck = new MallardDuck();
        // pack Turkey into TurkeyAdapter so it can behave as Duck
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe duckAdapter says...");
        testTurkey(duckAdapter);
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
