package patterns.factory.abstractfactory;

class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Preparing coffee in amount of " + amount);
        return new Coffee();
    }
}
