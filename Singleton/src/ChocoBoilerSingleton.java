public class ChocoBoilerSingleton {

    private static ChocoBoilerSingleton singletonInstance;

    private boolean empty;
    private boolean boiled;

    private ChocoBoilerSingleton(){
        empty = true;
        boiled = false;
    }

    public static ChocoBoilerSingleton getInstance(){
        if (singletonInstance == null) {
            singletonInstance = new ChocoBoilerSingleton();
        }
        return singletonInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}


