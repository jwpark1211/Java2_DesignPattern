package shape;

public abstract class ShapeDecorator extends Shape{
    protected Shape decoratedShape;
    protected ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
}
