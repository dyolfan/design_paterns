package patterns.composite.geometrical;

class Demo {
    public static void main(String[] args) {
        final GraphicObject drawing = new GraphicObject();
        drawing.setName("My drawing");
        drawing.children.add(new Square("Red"));
        drawing.children.add(new Square("Yellow"));

        final GraphicObject group = new GraphicObject();
        group.children.add(new Circle("Blue"));
        group.children.add(new Circle("White"));
        drawing.children.add(group);

        System.out.println(drawing);
    }
}
