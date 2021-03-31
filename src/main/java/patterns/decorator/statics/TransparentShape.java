package patterns.decorator.statics;

import java.util.function.Supplier;

class TransparentShape<T extends Shape> implements Shape {
    private int transparency;
    private Shape shape;

    public TransparentShape(Supplier<? extends T> sup, int transparency) {
        this.transparency = transparency;
        shape = sup.get();
    }

    @Override public String info() {
        return shape.info() + " and has transparency of " + transparency + "%";
    }
}
