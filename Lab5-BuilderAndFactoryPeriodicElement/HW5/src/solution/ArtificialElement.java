package solution;

public class ArtificialElement extends Element {
    
    private Phase phase;
    
    //artificial builder를 통한 생성자 
    protected ArtificialElement(ArtificialElementBuilder builder) {
        super(builder);
        this.phase = builder.phase;
    }
    
    //getter
    public Phase getPhase(){ return phase; }
    
    //artificialbuilder(extends ElementBuilder)
    public static class ArtificialElementBuilder extends ElementBuilder{

        private Phase phase;

        //필수값(number, name)을 포함한 builder 생성자 
        public ArtificialElementBuilder(int number, String name) {
            super(number, name);
        }
        //phase set -> elementBuilder return 
        public ArtificialElementBuilder setPhase(Phase phase){
            this.phase = phase;
            return this;
        }

        //return ArtificialElement
        @Override
        public Element build() {
            return new ArtificialElement(this);
        }

    }
}