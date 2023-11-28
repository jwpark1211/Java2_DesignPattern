package solution;

public class Element {

    private int number; //원소 번호 
    private String name; //원소 이름 
    private String symbol; //원소 symbol
    private double weight; //원소 무게 

    //getter
    public int getNumber() {return this.number;}
    public String getName() {return this.name;}
    public String getSymbol() {return this.symbol;}
    public double getWeight() {return this.weight;}
    
    //생성자 - 1)default 2)all member
    public Element(){}
    public Element(int number, String name, String symbol, double weight){
        this.number = number;
        this.name = name;
        this.symbol = symbol;
        this.weight = weight;
    }

    //객체 정보(String) return
    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", name='" + getName() + "'" +
            ", symbol='" + getSymbol() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }

}
