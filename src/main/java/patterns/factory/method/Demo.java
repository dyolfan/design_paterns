package patterns.factory.method;

class Demo {
    public static void main(String[] args) {
        Point point = Point.newPolarPoint(2, 3);
        Point point2 = Point.newCartesianPoint(2, 3);
    }
}
