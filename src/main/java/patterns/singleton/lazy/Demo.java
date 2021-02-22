package patterns.singleton.lazy;

class Demo {
    public static void main(String[] args) {
        System.out.println("Does not create an instance now");
        LazySingleton.getInstance();
    }
}
