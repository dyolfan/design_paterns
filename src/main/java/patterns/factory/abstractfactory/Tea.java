package patterns.factory.abstractfactory;

class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is good!");
    }
}
