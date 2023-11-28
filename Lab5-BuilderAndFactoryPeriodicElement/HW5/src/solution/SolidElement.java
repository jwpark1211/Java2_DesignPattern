package solution;

public class SolidElement extends Element {
    
    private Phase phase;

    //solid builder를 통한 생성자 
    protected SolidElement(SolidElementBuilder builder) {
        super(builder);
        this.phase = builder.phase;
    }
    
    //getter
    public Phase getPhase(){ return phase; }
    
    public static class SolidElementBuilder extends ElementBuilder{

        private Phase phase;

        //필수값(number, name)을 포함한 builder 생성자 
        public SolidElementBuilder(int number, String name) {
            super(number, name);
        }
        //phase set -> elementBuilder return 
        public SolidElementBuilder setPhase(Phase phase){
            this.phase = phase;
            return this;
        }
        
        //return SolidElement
        @Override
        public Element build() {
            return new SolidElement(this);
        }

    }
}