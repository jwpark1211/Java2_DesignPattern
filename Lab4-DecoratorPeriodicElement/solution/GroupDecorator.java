package solution;

public class GroupDecorator extends ElementDecorator{
    private int group;

    //groupDecorator를 정의 - 상위 클래스를 생성한 후 group 필드를 초기화 
    public GroupDecorator(int group, IElement element){
        super(element);
        this.group = group;
    }

    //상위 클래스에서 정의한 description에 group 정보를 더함
    @Override
    public String getDescription() {
        //group 필드의 null 여부 체크 (null이라면 그룹 필드 출력 X)
        if(group == -1) return this.element.getDescription()+", ";
        return this.element.getDescription()+","+group;
    }
}
