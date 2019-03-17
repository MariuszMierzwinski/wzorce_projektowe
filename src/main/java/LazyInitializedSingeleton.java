public class LazyInitializedSingeleton {
    private static LazyInitializedSingeleton instance;

    private LazyInitializedSingeleton() {
    }

    public static synchronized LazyInitializedSingeleton getInstance() { //synchronizde - zabezpiecza przy wielowątkowości
        if (instance == null) {
            instance = new LazyInitializedSingeleton();
        }
        return instance;
    }
}
