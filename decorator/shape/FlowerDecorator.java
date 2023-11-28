package shape;

public class FlowerDecorator extends ShapeDecorator {

    public FlowerDecorator(Shape shape){
        super(shape);
    }

    @Override
    public String getDescription() {
       return this.decoratedShape.getDescription() +  "+ Flower";
    }
    
}