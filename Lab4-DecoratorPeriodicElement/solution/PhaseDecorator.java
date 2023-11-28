package solution;

import template.Phase;

public class PhaseDecorator extends ElementDecorator{
    private Phase phase;
    //phaseDecorator를 정의 - 상위 클래스를 생성한 후 phase 필드를 초기화
    public PhaseDecorator(Phase phase,IElement element){
        super(element);
        this.phase = phase;
    }
    //상위 클래스에서 정의한 description에 phase 정보를 더함 
    @Override
    public String getDescription() {
       return this.element.getDescription()+","+phase.toString();
    }
}
