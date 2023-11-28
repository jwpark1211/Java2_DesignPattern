package solution;

public class SymbolDecorator extends ElementDecorator{
    private String symbol;

    //SymbolDecorator를 정의 - 상위 클래스를 생성한 후 symbol 필드를 초기화 
    public SymbolDecorator(String symbol, IElement element){
        super(element);
        this.symbol = symbol;
    }

    //상위 클래스에서 정의한 description에 symbol 정보를 더함 
    @Override
    public String getDescription() {
       return this.element.getDescription()+","+symbol;
    }
}
