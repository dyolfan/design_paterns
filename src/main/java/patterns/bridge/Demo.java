package patterns.bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

class Demo {
    public static void main(String[] args) {
        final RasterRendered rasterRendered = new RasterRendered();
        final VectorRenderer vectorRenderer = new VectorRenderer();

        final Circle circle = new Circle(vectorRenderer, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

        final Circle circle2 = new Circle(rasterRendered, 4);
        circle2.draw();
        circle2.resize(2);
        circle2.draw();

        final Injector injector = Guice.createInjector(new ShapeModule());

        final Circle circle3 = injector.getInstance(Circle.class);
        circle3.radius = 3;
        circle3.draw();
        circle3.resize(2);
        circle3.draw();
    }
}
