package shapeFactory;

public class ShapeColorFactory implements AbstractFactory<ShapeColor>{

    @Override
    public ShapeColor create(String type){
        switch(type){
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }
    
}
