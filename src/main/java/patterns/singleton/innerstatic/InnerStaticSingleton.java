package patterns.singleton.innerstatic;

// Thread-safe and lazy. New approach that is better than basic lazy singleton
class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }

    public InnerStaticSingleton getInstance() {
        return Implementation.INSTANCE;
    }

    private static class Implementation {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }
}
