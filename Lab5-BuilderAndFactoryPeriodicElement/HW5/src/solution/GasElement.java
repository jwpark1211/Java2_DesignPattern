package solution;

public class GasElement extends Element {
    private Phase phase;
    //gas Builder를 통한 생성자 
    protected GasElement(GasElementBuilder builder) {
        super(builder);
        this.phase = builder.phase;
    }
    //getter
    public Phase getPhase(){ return phase;}
    //GasElementBuilder(extends ElementBuilder)
    public static class GasElementBuilder extends ElementBuilder{
        private Phase phase;
        //필수값(number, name)을 포함한 builder 생성자 
        public GasElementBuilder(int number, String name) {
            super(number, name);
        }
        //phase set -> elementBuilder return
        public GasElementBuilder setPhase(Phase phase){
            this.phase = phase;
            return this;
        }
        //return GasElement
        @Override
        public Element build() {
            return new GasElement(this);
        }
    }
}
