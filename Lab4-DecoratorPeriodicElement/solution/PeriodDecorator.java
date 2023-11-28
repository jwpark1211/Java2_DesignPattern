package solution;

public class PeriodDecorator extends ElementDecorator{
    private int period;
    //PeriodDecorator를 정의 - 상위 클래스를 생성한 후 period 필드를 초기화
    public PeriodDecorator(int period, IElement element){
        super(element);
        this.period = period;
    }
    //상위 클래스에서 정의한 description에 period 정보를 더함
    @Override
    public String getDescription() {
       return this.element.getDescription()+","+period;
    }
}
