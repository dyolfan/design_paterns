package patterns.adapter;

import java.util.ArrayList;
import java.util.List;

class Demo {
    private static final List<VectorObject> vectorObjects = new ArrayList(List.of(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    private static void drawPoint(Point p) {
        System.out.println(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                final LineToPointAdapter points = new LineToPointAdapter(line);
                points.forEach(Demo::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
    }
}
