package patterns.singleton.serialization;

import java.io.Serializable;

class BasicSingleton implements Serializable {
    private static final BasicSingleton INSTANCE = new BasicSingleton();
    private int value = 0;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // If we won't add this method, then during serialization it will actually create another copy of the instance.
    // That breaks the singleton pattern
    protected Object readResolve() {
        return INSTANCE;
    }
}
