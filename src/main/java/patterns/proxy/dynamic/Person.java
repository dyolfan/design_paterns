package patterns.proxy.dynamic;

class Person implements Human {
    @Override
    public void walk() {
        System.out.println("Person walks");
    }

    @Override
    public void talk() {
        System.out.println("Person talks");
    }
}
