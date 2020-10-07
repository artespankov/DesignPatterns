public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        this.duck.quack();
    }

    public void fly() {
        System.out.println("I can only fly for short distance");
    }
}
