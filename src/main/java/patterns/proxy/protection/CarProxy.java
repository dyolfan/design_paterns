package patterns.proxy.protection;

class CarProxy extends Car {
    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age >= 18) {
            super.drive();
        } else {
            System.out.println("You are to young to drive");
        }
    }
}
