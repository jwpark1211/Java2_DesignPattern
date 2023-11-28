package solution;

//추상 메소드인 ElementDecorator를 정의한 후 IElement를 필드값으로 받아온다.
public abstract class ElementDecorator implements IElement {
    protected IElement element;
    protected ElementDecorator(IElement element){
        this.element = element;
    }
}
