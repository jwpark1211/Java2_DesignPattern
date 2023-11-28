package solution;

public class Element implements IElement {
    private int number;
    private String name;

    //element는 IElement를 받아와 number, name 필드로 구성한다.
    public Element(int number, String name){
        this.number = number;
        this.name = name;
    }

    //number와 name을 반환하는 getDescription()을 상속받아 구현한다. 
    @Override
    public String getDescription() {
        return number+","+name;
    }

}
