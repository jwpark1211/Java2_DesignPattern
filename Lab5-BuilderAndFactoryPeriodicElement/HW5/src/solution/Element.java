package solution;

public abstract class Element {
    protected int number; 
    protected String name; 
    protected String symbol; 
    protected double weight; 
    //builder를 이용한 생성자 -> Element return 
    protected Element(ElementBuilder builder){
        this.number = builder.number;
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.weight = builder.weight;
    }
    //getter
    public int getNumber(){ return number; }
    public String getName(){ return name; }
    public String getSymbol(){ return symbol; }
    public double getDouble(){ return weight; }
    //추상 inner class - ElementBuilder 
    public abstract static class ElementBuilder{
        protected int number;
        protected String name;
        protected String symbol;
        protected double weight;

        //필수 요소(number, name)을 포함한 생성자 
        public ElementBuilder(int number, String name){
            this.number =  number;
            this.name = name;
        }

        //setter -> ElementBuilder return
        public ElementBuilder setSymbol(String symbol){
            this.symbol = symbol;
            return this;
        }
        public ElementBuilder setWeight(double weight){
            this.weight = weight;
            return this;
        }

        //abstract method(하위 Builder에 의해 구현) - build()
        public abstract Element build();
    }


}
