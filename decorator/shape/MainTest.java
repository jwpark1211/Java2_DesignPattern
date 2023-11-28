package shape;

public class MainTest {
    
    public MainTest(){
        Shape rectangle = new Rectangle();
        rectangle = new ColorDecorator("Red",rectangle);
        rectangle = new PatternDecorator("Check Pattern", rectangle);
        rectangle.draw();

        Shape tri = new Triangle();
        tri = new ColorDecorator("Green", tri);
        tri = new ColorDecorator("Red", tri);
        tri = new ColorDecorator("Blue", tri);
        tri.draw();
    }
}
