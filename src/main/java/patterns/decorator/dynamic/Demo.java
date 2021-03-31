package patterns.decorator.dynamic;

class Demo {
    public static void main(String[] args) {
        final Circle circle = new Circle(10);
        System.out.println(circle.info());

        final ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        final TransparentShape myCircle = new TransparentShape(
                new ColoredShape(
                        new Circle(5), "green")
                , 50);
        System.out.println(myCircle.info());

    }
}
