package patterns.singleton.enumbased;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo {
    static void saveToFile(EnumBasedSingleton singleton, String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (EnumBasedSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        final String filename = "enumsingleton.bin";
        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
        // If this is uncommented, then both outputs will return 111,
        // but if you read again from the same file, then instance will have value 42.
        // EnumSingleton does not actually serialize the value
        // singleton.setValue(111);
        // System.out.println(singleton.getValue());
        // saveToFile(singleton, filename);

        final EnumBasedSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2.getValue());
    }
}
