package principles.liskov.substitution;

public class ShapeFactory {
    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }

    // This fixes unexpected behaviour caused by violating Liskov's substitution principle
    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }
}
