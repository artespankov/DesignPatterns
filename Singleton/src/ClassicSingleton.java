public class ClassicSingleton {

    // Static variable to store single instance
    private static ClassicSingleton uniqueInstance;

    // Private constructor
    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

}
