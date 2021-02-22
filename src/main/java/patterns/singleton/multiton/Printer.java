package patterns.singleton.multiton;

import java.util.HashMap;

class Printer {
    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    private static int instanceCount = 0;

    private Printer() {
        instanceCount++;
        System.out.println("Instance count " + instanceCount);
    }

    public static Printer get(Subsystem subsystem) {
        if (instances.containsKey(subsystem)) {
            return instances.get(subsystem);
        }

        Printer instance = new Printer();
        instances.put(subsystem, instance);

        return instance;
    }
}
