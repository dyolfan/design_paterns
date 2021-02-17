package principles.liskov.substitution;

class Demo {
    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected area of " + (width * 10) +
                ", got " + rectangle.getArea());
    }

    public static void main(String... args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        // Violating Liskov substitution principle.
        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);

        Rectangle square2 = ShapeFactory.newSquare(5);
        useIt(square2);
    }
}
