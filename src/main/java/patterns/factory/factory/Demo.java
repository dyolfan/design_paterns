package patterns.factory.factory;

class Demo {
    public static void main(String[] args) {
        Point.Factory.newPolarPoint(2, 3);
        Point.Factory.newCartesianPoint(2, 3);
    }
}
