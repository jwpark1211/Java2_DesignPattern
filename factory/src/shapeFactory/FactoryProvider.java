package shapeFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        switch(choice){
            case "COLOR":
                return new ShapeColorFactory();
            case "BUTTON":
                return new ButtonFactory();
            case "SHAPE":
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
