package patterns.decorator.statics;

import java.util.function.Supplier;

class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> sup, String color) {
        this.color = color;
        shape = sup.get();
    }

    @Override public String info() {
        return shape.info() + " has the color " + color;
    }
}
