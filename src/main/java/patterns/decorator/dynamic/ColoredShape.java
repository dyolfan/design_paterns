package patterns.decorator.dynamic;

class ColoredShape implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override public String info() {
        return shape.info() + " has the color " + color;
    }
}
