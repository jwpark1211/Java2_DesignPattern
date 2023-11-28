package Solution.Listener;

import template.PeriodicElement;

public class SymbolListener implements PeriodicTableListener{
    String symbol = "";
    public SymbolListener(String symbol) { this.symbol = symbol; }
    @Override
    public void update(PeriodicElement e) {
        //e의 symbol과 SymbolListener의 symbol값이 같으면 출력 
        if(e.getSymbol() == this.symbol){
            System.out.println("# SymbolListener [ Symbol : "+ symbol +" ]");
        }
    }
}

