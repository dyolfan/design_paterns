package patterns.proxy.protection;

class Demo {
    public static void main(String[] args) {
        Driver youngDriver = new Driver(12);
        Driver normalDriver = new Driver(20);

        Car car = new Car(youngDriver);
        Car car2 = new Car(normalDriver);
        CarProxy carProxy = new CarProxy(youngDriver);
        CarProxy carProxy2 = new CarProxy(normalDriver);

        car.drive();
        car2.drive();
        carProxy.drive();
        carProxy2.drive();
    }
}
