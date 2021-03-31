package patterns.decorator.statics;

class Square implements Shape {
    private float size;

    public Square() {
    }

    public Square(float size) {
        this.size = size;
    }

    @Override public String info() {
        return  "A square of size " + size;
    }
}
