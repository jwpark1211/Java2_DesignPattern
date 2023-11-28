package solution;

public class PhaseElementFactory {
    // getInstanceby phase -> Element
    public static Element getInstance(int number, String name, String symbol, double weight, Phase phase) {
        //phase를 기준으로 element 생성 
        switch (phase) { 
            //Builder pattern을 활용하여 Element 하위 객체 생성 후 return 
            case gas:
                return new GasElement.GasElementBuilder(number, name)
                                    .setPhase(Phase.gas)
                                    .setSymbol(symbol)
                                    .setWeight(weight)
                                    .build();
            case solid:
                return new SolidElement.SolidElementBuilder(number, name)
                                    .setPhase(Phase.solid)
                                    .setSymbol(symbol)
                                    .setWeight(weight)
                                    .build();
            case liq:
                return new LiquidElement.LiquidElementBuilder(number, name)
                                    .setPhase(Phase.liq)
                                    .setSymbol(symbol)
                                    .setWeight(weight)
                                    .build();
            case artificial:
                return new ArtificialElement.ArtificialElementBuilder(number, name)
                                    .setPhase(Phase.artificial)
                                    .setSymbol(symbol)
                                    .setWeight(weight)
                                    .build();
                
            default:
                return null;
        }
    }

}
