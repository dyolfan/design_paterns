package patterns.singleton.lazy;

class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Initializing a lazy singleton");
    }

    // This approach works, but has performance issues
    // public static synchronized LazySingleton getInstance() {
    //     if (instance == null) {
    //         instance = new LazySingleton();
    //  }
    //
    //     return instance;
    // }

    // Double-lock checking
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
