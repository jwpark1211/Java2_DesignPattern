package shapeFactory;

public class ShapeFactory implements AbstractFactory<Shape>{

    @Override
    public Shape create(String type) {
        switch(type){
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
    
}
