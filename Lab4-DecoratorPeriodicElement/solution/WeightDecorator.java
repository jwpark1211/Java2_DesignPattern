package solution;

public class WeightDecorator extends ElementDecorator{
    private double weight;
    //weightDecorator를 정의 - 상위 클래스를 생성한 후 weight 필드를 초기화
    public WeightDecorator(double weight, IElement element){
        super(element);
        this.weight = weight;
    }
    //상위 클래스에서 정의한 description에 weight 정보를 더함
    @Override
    public String getDescription() {
       return this.element.getDescription()+","+weight;
    }
}

