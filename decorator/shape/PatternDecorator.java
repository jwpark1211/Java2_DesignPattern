package shape;

public class PatternDecorator extends ShapeDecorator {

    private String pattern;

    public PatternDecorator(String pattern, Shape shape){
        super(shape);
        this.pattern = pattern;
    }

    @Override
    public String getDescription() {
       return this.decoratedShape.getDescription() + "+" + pattern; 
    }
    
}