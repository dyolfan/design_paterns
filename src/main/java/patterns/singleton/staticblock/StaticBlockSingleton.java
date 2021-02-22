package patterns.singleton.staticblock;

import java.io.File;
import java.io.IOException;

class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton(true);
        } catch (Exception e) {
            System.out.println("Failed to create singleton instance");
            instance = new StaticBlockSingleton();
        }
    }

    private StaticBlockSingleton(boolean throwExceptions) throws IOException {
        System.out.println("Singleton is initializing");
        if (throwExceptions) {
            File.createTempFile(".", ".");
        }
    }

    private StaticBlockSingleton() {
        System.out.println("Singleton fallback is initializing");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
