package principles.liskov.substitution;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        super(size, size);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    // Setters will cause different behaviour then we expect
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
