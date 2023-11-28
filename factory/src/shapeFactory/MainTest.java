package shapeFactory;

public class MainTest {
    public MainTest(){
        AbstractFactory<ShapeColor> colorFactory = FactoryProvider.getFactory("COLOR");
        ShapeColor c1 = colorFactory.create("RED");
        c1.color();
        c1 = colorFactory.create("GREEN");
        c1.color();
        c1 = colorFactory.create("BLUE");
        c1.color();

        AbstractFactory<Shape> shapeFactory = FactoryProvider.getFactory("SHAPE");
        Shape s1 = shapeFactory.create("Rectangle");
        s1.draw();
        s1 = shapeFactory.create("Circle");
        s1.draw();

        AbstractFactory<Button> buttonFactory = FactoryProvider.getFactory("BUTTON");
        Button b1 = buttonFactory.create("PushButton");
        b1.paint();
    }
}
