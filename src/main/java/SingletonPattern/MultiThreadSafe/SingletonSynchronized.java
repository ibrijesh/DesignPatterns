package SingletonPattern.MultiThreadSafe;

public final class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {

    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null)
            return new SingletonSynchronized();
        return instance;
    }

}
