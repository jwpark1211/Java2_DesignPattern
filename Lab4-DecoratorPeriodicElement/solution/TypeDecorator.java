package solution;

public class TypeDecorator extends ElementDecorator{
    private String type;
    //typeDecorator를 정의 - 상위 클래스를 생성한 후 type 필드를 초기화
    public TypeDecorator(String type,IElement element){
        super(element);
        this.type = type;
    }
    //상위 클래스에서 정의한 description에 type 정보를 더함
    @Override
    public String getDescription() {
       return this.element.getDescription()+","+type;
    }
}
