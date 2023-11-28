package solution;

public class LiquidElement extends Element{
   
    private Phase phase;

    //liquid builder를 통한 생성자 
    protected LiquidElement(LiquidElementBuilder builder){
        super(builder);
        this.phase = builder.phase;
    }

    //getter
    public Phase getPhase(){ return phase; }

    public static class LiquidElementBuilder extends ElementBuilder{
      
        private Phase phase;
        
        //필수값(number, name)을 포함한 builder 생성자 
        public LiquidElementBuilder(int number, String name){
            super(number, name);
        }
        //phase set -> elementBuilder return 
        public LiquidElementBuilder setPhase(Phase phase){
            this.phase = phase;
            return this;
        }

        //return LiquidElement
        @Override
        public Element build(){
            return new LiquidElement(this);
        }
    }
}
