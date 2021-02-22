package patterns.singleton.basic;

class Demo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        System.out.println(singleton.getValue());
        singleton.setValue(20);

        BasicSingleton singleton2 = BasicSingleton.getInstance();

        System.out.println(singleton2.getValue());
    }
}
