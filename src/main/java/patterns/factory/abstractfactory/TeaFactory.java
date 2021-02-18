package patterns.factory.abstractfactory;

class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Preparing tea in amount of " + amount);
        return new Tea();
    }
}
